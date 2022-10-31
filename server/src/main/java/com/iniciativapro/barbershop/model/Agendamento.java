package com.iniciativapro.barbershop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="agendamentos")
public class Agendamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataAgendamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idServico")
    private Servico servico;

    public Agendamento() {
    }

    public Agendamento(Date dataAgendamento, Usuario usuario, Servico servico) {
        this.dataAgendamento = dataAgendamento;
        this.usuario = usuario;
        this.servico = servico;
    }

    public Long getId() {
        return id;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Servico getServico() {
        return servico;
    }


}
