package com.example.demo.repository;

import com.example.demo.model.AnomalyFlagRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnomalyFlagRecordRepository extends JpaRepository<AnomalyFlagRecord, Long> {
    /**
     * Used by Test 46 to find flags associated with a specific metric
     */
    List<AnomalyFlagRecord> findByMetricId(Long metricId);

    /**
     * findAll() is inherited from JpaRepository, used by Test 54
     */
}