package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDate date;
    private Double hoursLogged;
    private Integer tasksCompleted;
    private Integer meetingsAttended;
    private Double productivityScore;
    private LocalDateTime submittedAt = LocalDateTime.now();

    // getters & setters
}
