package com.iniciativapro.barbershop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicos")
public class Servico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServico;
    private String nome;
    private String loja;
    private Double preco;
    private String descricao;

    public Servico() {
    }

    public Servico(String nome, String loja, Double preco, String descricao) {
        this.nome = nome;
        this.loja = loja;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Long getIdServico() {
        return idServico;
    }

    public String getNome() {
        return nome;
    }

    public String getLoja() {
        return loja;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
