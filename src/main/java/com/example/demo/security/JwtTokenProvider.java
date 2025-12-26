package com.example.demo.security;

public class JwtTokenProvider {

    public String generateToken(String username) {
        return "dummy-jwt-token";
    }

    public boolean validateToken(String token) {
        return token != null && !token.isEmpty();
    }

    public String getUsernameFromToken(String token) {
        return "user";
    }
}
