package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductivityMetricRecord {

    private Long id;
    private Long employeeId;
    private LocalDate date;
    private Integer hours;
    private Integer tasks;
    private Integer meetings;
    private Integer score;
    private LocalDateTime createdAt;

    public ProductivityMetricRecord() {}

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getTasks() {
        return tasks;
    }

    public void setTasks(Integer tasks) {
        this.tasks = tasks;
    }

    public Integer getMeetings() {
        return meetings;
    }

    public void setMeetings(Integer meetings) {
        this.meetings = meetings;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
