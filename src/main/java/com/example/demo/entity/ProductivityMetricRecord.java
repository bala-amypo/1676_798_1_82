package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int hoursLogged;
    private int tasksCompleted;
    private int meetingsAttended;
    private double productivityScore;

    @ManyToOne
    private EmployeeProfile employee;

    public LocalDate getDate() { return date; }
    public int getHoursLogged() { return hoursLogged; }
    public int getTasksCompleted() { return tasksCompleted; }
    public int getMeetingsAttended() { return meetingsAttended; }

    public void setEmployee(EmployeeProfile employee) {
        this.employee = employee;
    }

    public void setProductivityScore(double productivityScore) {
        this.productivityScore = productivityScore;
    }
}
