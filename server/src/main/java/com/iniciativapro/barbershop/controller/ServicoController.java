package com.iniciativapro.barbershop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iniciativapro.barbershop.model.Servico;
import com.iniciativapro.barbershop.service.ServicoService;

@RestController
@RequestMapping("/servico")
@Transactional
public class ServicoController {
    @Autowired
    private ServicoService servicoService;

    @GetMapping("/all")
    public List<Servico> ServicoAll(){
        return servicoService.findAllServico();
    }
}
