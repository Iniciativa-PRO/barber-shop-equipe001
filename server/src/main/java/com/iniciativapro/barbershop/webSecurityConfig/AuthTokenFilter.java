package com.iniciativapro.barbershop.webSecurityConfig;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.iniciativapro.barbershop.exceptions.NoAuthorized;
import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.repository.UsuarioRepository;


public class AuthTokenFilter extends OncePerRequestFilter {

    private TokenService tokenService;
    private UsuarioRepository usuarioRepository;

    public AuthTokenFilter(TokenService tokenService, UsuarioRepository usuarioRepository) {
        this.tokenService = tokenService;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = getToken(request);
        boolean tokenValid = tokenService.isTokenValid(token);

        
        try {
            if(tokenValid){
                authenticate(token);
            }

            filterChain.doFilter(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }

    private void authenticate(String token) throws Exception {
        try {
            String username = tokenService.getUsername(token);
            Usuario usuario = usuarioRepository.findByNome(username);

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception e) {
            throw new NoAuthorized();
        }
    }

    private String getToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

		if (token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
            return null;
        }

        return token.substring(7, token.length());
    }

}
