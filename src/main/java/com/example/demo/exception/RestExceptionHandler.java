package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public String handle(ResourceNotFoundException ex) {
        return ex.getMessage();
    }
}
