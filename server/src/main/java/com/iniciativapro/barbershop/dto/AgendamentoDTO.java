package com.iniciativapro.barbershop.dto;

import java.util.Date;

import com.iniciativapro.barbershop.model.Agendamento;
import com.iniciativapro.barbershop.model.Servico;

public class AgendamentoDTO {
    private Long id;
    private Date dataAgendamento;
    private Servico servico;

    public AgendamentoDTO(Agendamento agendamento){
        this.id = agendamento.getId();
        this.dataAgendamento = agendamento.getDataAgendamento();
        this.servico = agendamento.getServico();
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDataAgendamento() {
        return dataAgendamento;
    }
    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
