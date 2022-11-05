package com.iniciativapro.barbershop.dto;

import com.iniciativapro.barbershop.model.Usuario;

public class UsuarioDataDto {
    private Long id;
    private String nome;
    private String email;

    public UsuarioDataDto(Long id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public UsuarioDataDto(Usuario usuario){
        this.id = usuario.getIdUsuario();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

}
