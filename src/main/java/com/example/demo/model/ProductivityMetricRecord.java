package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "productivity_metric_record")
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId; // Changed from String to Long

    private double hoursLogged;
    private int tasksCompleted;
    private int meetingsAttended;
    private double productivityScore;

    private LocalDate date;

    @Column(columnDefinition = "TEXT")
    private String rawDataJson;

    /* ================= Constructors ================= */

    public ProductivityMetricRecord() {}

    public ProductivityMetricRecord(
            Long employeeId,
            double hoursLogged,
            int tasksCompleted,
            int meetingsAttended,
            double productivityScore,
            LocalDate date,
            String rawDataJson) {
        this.employeeId = employeeId;
        this.hoursLogged = hoursLogged;
        this.tasksCompleted = tasksCompleted;
        this.meetingsAttended = meetingsAttended;
        this.productivityScore = productivityScore;
        this.date = date;
        this.rawDataJson = rawDataJson;
    }

    /* ================= Getters & Setters ================= */

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

    // Optional convenience methods for String input
    public void setEmployeeId(String employeeId) {
        if (employeeId != null) {
            this.employeeId = Long.valueOf(employeeId);
        }
    }

    public double getHoursLogged() {
        return hoursLogged;
    }

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

    public double getProductivityScore() {
        return productivityScore;
    }

    public void setProductivityScore(double productivityScore) {
        this.productivityScore = productivityScore;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getRawDataJson() {
        return rawDataJson;
    }

    public void setRawDataJson(String rawDataJson) {
        this.rawDataJson = rawDataJson;
    }
}
