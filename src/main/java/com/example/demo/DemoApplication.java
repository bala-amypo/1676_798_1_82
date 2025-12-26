package com.example.demo.util;

public class ProductivityCalculator {

    public static double computeScore(double hours, int tasks, int meetings) {
        // Test 27: Handle NaN or Infinite
        if (Double.isNaN(hours) || Double.isInfinite(hours)) return 0.0;

        // Test 11 & 19: Handle Negative or Zero
        if (hours <= 0 || tasks < 0) return 0.0;

        // Base logic: tasks weighted against hours, penalized by meetings
        double baseScore = (tasks * 15.0) / (hours / 8.0);
        double penalty = meetings * 2.0;
        double finalScore = baseScore - penalty;

        // Test 18 & 56: Clamp between 0 and 100
        if (finalScore > 100.0) finalScore = 100.0;
        if (finalScore < 0.0) finalScore = 0.0;

        // Test 57: Round to 2 decimal places
        return Math.round(finalScore * 100.0) / 100.0;
    }
}