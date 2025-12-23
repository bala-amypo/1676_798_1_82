package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "anomaly_flag_records")
public class AnomalyFlagRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ✅ Relationship with ProductivityMetricRecord
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "metric_id", nullable = false)
    private ProductivityMetricRecord metric;

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private boolean resolved = false;

    // =====================
    // Getters and Setters
    // =====================

    public Long getId() {
        return id;
    }

    public ProductivityMetricRecord getMetric() {
        return metric;
    }

    public void setMetric(ProductivityMetricRecord metric) {
        this.metric = metric;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
