package com.iniciativapro.barbershop.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.iniciativapro.barbershop.dto.RegistrarUsuarioDto;
import com.iniciativapro.barbershop.dto.RegistrarUsuarioReponseDto;
import com.iniciativapro.barbershop.repository.UsuarioRepository;
import com.iniciativapro.barbershop.service.RegisterUserService;

@RestController
@RequestMapping("/")
public class RegisterController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@PostMapping("/register")
	@Transactional
	public ResponseEntity<RegistrarUsuarioReponseDto> resgiterUser(@RequestBody @Valid RegistrarUsuarioDto form,
			UriComponentsBuilder uriBuilder) {

		RegisterUserService userService = new RegisterUserService(usuarioRepository);
		
		return userService.userRegister(form, uriBuilder);
	}
}
