package com.iniciativapro.barbershop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iniciativapro.barbershop.model.Servico;
import com.iniciativapro.barbershop.repository.ServicoRepository;

@Service
public class ServicoService {
    @Autowired
    ServicoRepository servicoRepository;
    
    public Servico save(Servico servico){
        return this.servicoRepository.save(servico);
    }

    public Servico getServico(Long id) {
        return this.servicoRepository.getReferenceById(id);
    }

    public List<Servico> findAllServico() {
        return this.servicoRepository.findAll();
    }
}
