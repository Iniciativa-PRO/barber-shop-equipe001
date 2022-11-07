package com.iniciativapro.barbershop.service;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.iniciativapro.barbershop.dto.RegistrarUsuarioDto;
import com.iniciativapro.barbershop.dto.RegistrarUsuarioReponseDto;
import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.repository.UsuarioRepository;


@Service
public class RegisterUserService {

    private UsuarioRepository usuarioRepository;

    public RegisterUserService() {
    }

    @Autowired
    public RegisterUserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ResponseEntity<RegistrarUsuarioReponseDto> userRegister(@Valid RegistrarUsuarioDto form,
            UriComponentsBuilder uriBuilder) {

        Usuario user = this.usuarioRepository.findByNome(form.getNome());
        Optional<Usuario> email = this.usuarioRepository.findByEmail(form.getEmail());

        if (user == null && email.isEmpty()) {
            Usuario userRegister = form.encode();
            usuarioRepository.save(userRegister);

            URI uri = uriBuilder.path("/{id}").buildAndExpand(userRegister.getUsername()).toUri();

            return ResponseEntity.created(uri).body(new RegistrarUsuarioReponseDto(userRegister));
        }

        return ResponseEntity.status(403).build();
    }
}
