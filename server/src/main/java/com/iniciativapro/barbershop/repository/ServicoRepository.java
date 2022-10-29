package com.iniciativapro.barbershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iniciativapro.barbershop.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long>{
    
}
