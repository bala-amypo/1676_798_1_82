package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "team_summary_record")
public class TeamSummaryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long teamId;
    private int totalHours;
    private int totalTasks;
    private int totalMeetings;

    // Constructors
    public TeamSummaryRecord() {
    }

    public TeamSummaryRecord(Long teamId, int totalHours, int totalTasks, int totalMeetings) {
        this.teamId = teamId;
        this.totalHours = totalHours;
        this.totalTasks = totalTasks;
        this.totalMeetings = totalMeetings;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public int getTotalMeetings() {
        return totalMeetings;
    }

    public void setTotalMeetings(int totalMeetings) {
        this.totalMeetings = totalMeetings;
    }
}
