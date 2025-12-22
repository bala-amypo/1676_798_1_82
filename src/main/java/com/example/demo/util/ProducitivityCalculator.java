package com.example.demo.util;

public class ProductivityCalculator {

    public static double compute(double h, int t, int m) {
        h = Math.max(0, h);
        t = Math.max(0, t);
        m = Math.max(0, m);

        double score = (h * 10) + (t * 5) + (m * 2);
        return Math.min(100.0, score);
    }
}
