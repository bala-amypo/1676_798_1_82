package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anomaly_rule")
public class AnomalyRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;
    private String name;
    private String description;
    private double thresholdValue;

    // --- Constructors ---

    public AnomalyRule() {
    }

    public AnomalyRule(String ruleCode, String name, String description, double thresholdValue) {
        this.ruleCode = ruleCode;
        this.name = name;
        this.description = description;
        this.thresholdValue = thresholdValue;
    }

    // --- Getters & Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(double thresholdValue) {
        this.thresholdValue = thresholdValue;
    }
}
