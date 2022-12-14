package com.iniciativapro.barbershop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        
        return this.usuarioRepository.save(usuario);
    }

    public Usuario findByUsuario(Long id) {
        Optional<Usuario> usuario = this.usuarioRepository.findById(id);
        if(usuario.isPresent()){
            return usuario.get();
        }
        
        return null;
    }

    public Optional<Usuario> findByEmail(String email){
        return this.usuarioRepository.findByEmail(email);
    }

    public Usuario findByNomeUsuario(String nome) {
        return this.usuarioRepository.findByNome(nome);
    }
}
