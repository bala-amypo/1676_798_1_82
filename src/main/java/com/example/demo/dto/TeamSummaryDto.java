package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TeamSummaryDto {

    private Long id;
    private String teamName;
    private LocalDate summaryDate;
    private Double avgScore;
    private Integer anomalyCount;
    private LocalDateTime generatedAt;

    public TeamSummaryDto() {}

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public LocalDate getSummaryDate() {
        return summaryDate;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public Integer getAnomalyCount() {
        return anomalyCount;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSummaryDate(LocalDate summaryDate) {
        this.summaryDate = summaryDate;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public void setAnomalyCount(Integer anomalyCount) {
        this.anomalyCount = anomalyCount;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }
}
