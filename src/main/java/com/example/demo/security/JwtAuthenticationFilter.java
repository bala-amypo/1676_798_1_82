package com.example.demo.security;

public class JwtAuthenticationFilter {

    public boolean doFilter(String authorizationHeader) {
        if (authorizationHeader == null) return false;
        return authorizationHeader.startsWith("Bearer ");
    }
}
