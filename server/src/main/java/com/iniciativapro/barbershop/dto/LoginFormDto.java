package com.iniciativapro.barbershop.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginFormDto {
    @NotNull @NotEmpty 
    private String senha;

    @NotNull @NotEmpty
    private String email;

    public LoginFormDto(){}

    public LoginFormDto(@NotNull @NotEmpty String senha, @NotNull @NotEmpty String email) {
        this.senha = senha;
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public UsernamePasswordAuthenticationToken convert() {
        return new UsernamePasswordAuthenticationToken(email, senha);
    }

}
