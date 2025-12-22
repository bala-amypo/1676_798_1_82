package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AnomalyFlagRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private EmployeeProfile employee;

    @ManyToOne
    private ProductivityMetricRecord metric;

    private String severity;
    private String details;

    public void setEmployee(EmployeeProfile employee) {
        this.employee = employee;
    }

    public void setMetric(ProductivityMetricRecord metric) {
        this.metric = metric;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
