package com.example.demo.util;

public class ProductivityCalculator {

    public static double calculate(int hours, int tasks, int meetings) {
        return (tasks * 2.0) - meetings + (hours * 0.5);
    }
}
