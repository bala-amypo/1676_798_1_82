package com.example.demo.exception;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException() {
        super("authentication failed");
    }
}
