package com.example.demo.util;

public class ProductivityCalculator {

    public static double calculate(int hoursWorked, int tasksCompleted) {
        if (hoursWorked <= 0) {
            return 0;
        }
        return (double) tasksCompleted / hoursWorked;
    }
}
