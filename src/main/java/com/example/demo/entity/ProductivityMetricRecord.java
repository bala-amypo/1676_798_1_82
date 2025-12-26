package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ProductivityMetricRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private int hours;
    private int tasks;
    private int meetings;
    private int score;
    private LocalDateTime date;

    // getters and setters
}
