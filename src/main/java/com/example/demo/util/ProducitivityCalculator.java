package com.example.demo.util;

public class ProductivityCalculator {

    public static int compute(int completed, int pending, int overdue) {
        return completed * 2 - pending - overdue * 2;
    }
}
