package com.iniciativapro.barbershop.controller;

import java.io.Console;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iniciativapro.barbershop.dto.UsuarioDataDto;
import com.iniciativapro.barbershop.dto.UsuarioDto;
import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.service.UsuarioService;

@RestController
@RequestMapping("/registrar")
@Transactional
public class RegistrarUsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> RegistrarUsuario(@RequestBody UsuarioDto usuarioDto ){
        Optional<Usuario> usuarioExist = usuarioService.findByEmail(usuarioDto.getEmail());

        if(!usuarioExist.isPresent()){
            Usuario usuario = new Usuario(usuarioDto);
            Usuario usuarioCriado = usuarioService.save(usuario);
            return ResponseEntity.ok().body(new UsuarioDataDto(usuarioCriado));
        }

        return ResponseEntity.notFound().build();
    }
}
