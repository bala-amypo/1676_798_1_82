package com.example.demo.entity;

public class AnomalyRule {

    private String ruleCode;
    private Boolean active = true;
    private Double thresholdValue;

    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(Strpackage com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class AnomalyRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;
    private String condition;

    // getters and setters
}
ing ruleCode) { this.ruleCode = ruleCode; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }

    public Double getThresholdValue() { return thresholdValue; }
    public void setThresholdValue(Double thresholdValue) { this.thresholdValue = thresholdValue; }
}
