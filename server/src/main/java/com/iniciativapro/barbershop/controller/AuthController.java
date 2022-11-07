package com.iniciativapro.barbershop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iniciativapro.barbershop.dto.LoginFormDto;
import com.iniciativapro.barbershop.dto.TokenDto;
import com.iniciativapro.barbershop.service.AuthUserService;
import com.iniciativapro.barbershop.webSecurityConfig.TokenService;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<TokenDto> authenticate(@RequestBody @Valid LoginFormDto form) {

        AuthUserService authService = new AuthUserService(authManager, tokenService);

        return authService.authUser(form);
    }
}
