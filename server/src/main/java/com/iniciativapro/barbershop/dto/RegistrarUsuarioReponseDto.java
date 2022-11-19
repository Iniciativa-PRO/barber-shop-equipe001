package com.iniciativapro.barbershop.dto;

import com.iniciativapro.barbershop.model.Usuario;

public class RegistrarUsuarioReponseDto {
    private Long idUsuario;
    private String nome;
    private String email;

    public RegistrarUsuarioReponseDto() {
    }

    public RegistrarUsuarioReponseDto(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
}
