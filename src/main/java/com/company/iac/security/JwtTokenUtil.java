package com.company.iac.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {
    private static final String SECRET_KEY = "secret";
    private static final long EXPIRATION_TIME = 864_000_000; // 10 days

    public String generateToken(String username) {
        return Jwts.builder()
           .setSubject(username)
           .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
           .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
           .compact();
    }

    public Claims getClaimsFromToken(String token) {
        return Jwts.parser()
           .setSigningKey(SECRET_KEY)
           .parseClaimsJws(token)
           .getBody();
    }
}