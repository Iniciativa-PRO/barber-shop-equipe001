package com.iniciativapro.barbershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iniciativapro.barbershop.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
   
}
