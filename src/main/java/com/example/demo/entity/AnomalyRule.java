package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AnomalyRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double thresholdValue;
    private String ruleCode;

    public double getThresholdValue() {
        return thresholdValue;
    }

    public String getRuleCode() {
        return ruleCode;
    }
}
