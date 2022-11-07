package com.iniciativapro.barbershop.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iniciativapro.barbershop.dto.AgendamentoDTO;
import com.iniciativapro.barbershop.model.Agendamento;
import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento save(Agendamento agendamento){
        return this.agendamentoRepository.save(agendamento);
    }

    public List<AgendamentoDTO> findAllAgendamentos(Usuario usuario) {
        return this.agendamentoRepository.findByUsuario(usuario)
            .stream()
            .map(AgendamentoDTO::new)
            .collect(Collectors.toList());
    }

    public Optional<Agendamento> findByAgendamento(Long id){
        return this.agendamentoRepository.findById(id);
    }

    public void deleteAgendamento(Long id) {
        this.agendamentoRepository.deleteById(id);
    }

    // public void findByUsuarioAgendamento(Long id, Usuario idUsuario) {
    //     this.agendamentoRepository.findByUsuarioAgendamento(id, idUsuario);
    // }
}
