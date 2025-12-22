package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "anomaly_flag_records")
@Getter
@Setter
public class AnomalyFlagRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;
    private String severity;
    private String details;
    private Boolean resolved = false;
    private LocalDateTime flaggedAt = LocalDateTime.now();

    @ManyToOne
    private EmployeeProfile employee;

    @ManyToOne
    private ProductivityMetricRecord metric;
}
