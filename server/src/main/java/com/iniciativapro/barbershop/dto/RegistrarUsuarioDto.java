package com.iniciativapro.barbershop.dto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.iniciativapro.barbershop.model.Usuario;

public class RegistrarUsuarioDto {
    private String nome;
    private String email;
    private String senha;

    public RegistrarUsuarioDto(){}
    
    public RegistrarUsuarioDto(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }

    public Usuario encode() {
        String passwordEncoder = new BCryptPasswordEncoder().encode(senha);
        return new Usuario(nome, email, passwordEncoder);
    }

    
}
