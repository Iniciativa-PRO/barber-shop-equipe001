package com.iniciativapro.barbershop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iniciativapro.barbershop.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByEmail(String email);

    Usuario findByNome(String nome);
   
}
