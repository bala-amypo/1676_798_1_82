package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "productivity_metric_record")
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Required by tests
    private Long employeeId;

    // Required by tests (double + exact name)
    private double hoursLogged;

    private int tasksCompleted;
    private int meetingsAttended;

    private int productivityScore;

    // Required by tests
    private LocalDate date;

    // Required by tests
    @Column(columnDefinition = "TEXT")
    private String rawDataJson;

    private LocalDateTime createdAt;

    // ---------------- Constructors ----------------

    public ProductivityMetricRecord() {
        this.createdAt = LocalDateTime.now();
    }

    // ---------------- Getters & Setters ----------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    // 🔑 REQUIRED BY TEST
    public double getHoursLogged() {
        return hoursLogged;
    }

    // 🔑 REQUIRED BY TEST
    public void setHoursLogged(double hoursLogged) {
        this.hoursLogged = hoursLogged;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public int getMeetingsAttended() {
        return meetingsAttended;
    }

    public void setMeetingsAttended(int meetingsAttended) {
        this.meetingsAttended = meetingsAttended;
    }

    public int getProductivityScore() {
        return productivityScore;
    }

    public void setProductivityScore(int productivityScore) {
        this.productivityScore = productivityScore;
    }

    // 🔑 REQUIRED BY TEST
    public LocalDate getDate() {
        return date;
    }

    // 🔑 REQUIRED BY TEST
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // 🔑 REQUIRED BY TEST
    public String getRawDataJson() {
        return rawDataJson;
    }

    // 🔑 REQUIRED BY TEST
    public void setRawDataJson(String rawDataJson) {
        this.rawDataJson = rawDataJson;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
