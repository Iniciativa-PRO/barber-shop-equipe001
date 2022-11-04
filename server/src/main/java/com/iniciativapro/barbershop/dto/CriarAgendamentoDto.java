package com.iniciativapro.barbershop.dto;

public class CriarAgendamentoDto {
    private Long idServico;
    private Long idUsuario;

    public CriarAgendamentoDto(Long idUsuario, Long idServico){
        this.idUsuario = idUsuario;
        this.idServico = idServico;
    }
    
    public Long getIdServico() {
        return idServico;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
}
