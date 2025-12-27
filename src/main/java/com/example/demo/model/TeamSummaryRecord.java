package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class TeamSummaryRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long teamId;
    private int totalHours;
    private int totalTasks;
    private int totalMeetings;

    // getters and setters
}
