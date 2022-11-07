package com.iniciativapro.barbershop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table (name = "usuario_roles")
public class UsuarioRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public String getUsername() {
        return nome;
    }

    public void setUsername(String username) {
        this.nome = username;
    }

    @Override
    public String getAuthority() {
        return nome;
    } 
}
