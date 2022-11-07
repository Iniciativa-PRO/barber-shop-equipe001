package com.iniciativapro.barbershop.dto;

public class CriarAgendamentoDto {
    private Long idServico;

    public CriarAgendamentoDto(Long idUsuario, Long idServico){
        this.idServico = idServico;
    }
    
    public Long getIdServico() {
        return idServico;
    }
}
