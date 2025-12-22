package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productivity_metric_record")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String employeeId;

    @Column(nullable = false)
    private int productivityScore;

    @Column(nullable = false)
    private String metricDate;
}
