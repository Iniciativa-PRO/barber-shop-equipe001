package com.iniciativapro.barbershop.webSecurityConfig;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.iniciativapro.barbershop.model.Usuario;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

    @Value("${barbershop.jwt.expiration}")
    private String expiration;

    @Value("${barbershop.jwt.secret}")
    private String secret;

    public String genToken(Authentication authentication) {
        Usuario userLogin = (Usuario) authentication.getPrincipal();
        Date today = new Date();
        Date dateExpiration = new Date(today.getTime() + Long.parseLong(expiration));

        return Jwts.builder()
        .setIssuer("barber shop")
        .setSubject(userLogin.getNome().toString())
        .setIssuedAt(today)
        .setExpiration(dateExpiration)
        .signWith(SignatureAlgorithm.HS256, secret)
        .compact();
    }

    public boolean isTokenValid(String token) {
        try {
            Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsername(String token) {
        Claims claims = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

}
