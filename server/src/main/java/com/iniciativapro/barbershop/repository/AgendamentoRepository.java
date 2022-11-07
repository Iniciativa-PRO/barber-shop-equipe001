package com.iniciativapro.barbershop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iniciativapro.barbershop.model.Agendamento;
import com.iniciativapro.barbershop.model.Usuario;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByUsuario(Usuario usuario);
}
