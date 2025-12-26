package com.example.demo.exception;

public class DuplicateMetricException extends RuntimeException {

    public DuplicateMetricException(String message) {
        super(message);
    }

    public DuplicateMetricException() {
        super("metric already exists");
    }
}
