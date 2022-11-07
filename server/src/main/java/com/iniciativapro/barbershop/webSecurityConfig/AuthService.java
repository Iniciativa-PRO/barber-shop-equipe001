package com.iniciativapro.barbershop.webSecurityConfig;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.service.UsuarioService;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuario = usuarioService.findByEmail(email);

        if(usuario.isPresent()){
            return (UserDetails) usuario.get();
        }

        throw new UsernameNotFoundException("invalid credencials!");
    }
    
}
