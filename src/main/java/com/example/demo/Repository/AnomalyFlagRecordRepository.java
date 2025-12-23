package com.example.demo.repository;

import com.example.demo.entity.AnomalyFlagRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnomalyFlagRecordRepository
        extends JpaRepository<AnomalyFlagRecord, Long> {

    // ✅ Correct derived query (metric.id)
    List<AnomalyFlagRecord> findByMetric_Id(Long metricId);

    // ✅ Find unresolved anomalies
    List<AnomalyFlagRecord> findByResolvedFalse();
}
