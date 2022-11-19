package com.iniciativapro.barbershop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.iniciativapro.barbershop.model.Agendamento;
import com.iniciativapro.barbershop.model.Usuario;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByUsuario(Usuario usuario);

    // @Query("DELETE FROM Agendamento WHERE id_usuario = :id_usuario AND id = :agendamento")
    // void deleteAgedamentoByUsuario(@Param("id_usuario") Long id_usuario, @Param("id_agendamento") Long agendamento);
}
