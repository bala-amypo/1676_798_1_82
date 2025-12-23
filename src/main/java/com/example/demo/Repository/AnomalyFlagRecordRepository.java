package com.example.demo.repository;

import com.example.demo.entity.AnomalyFlagRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnomalyFlagRecordRepository
        extends JpaRepository<AnomalyFlagRecord, Long> {

    // 🔹 By metric id
    List<AnomalyFlagRecord> findByMetric_Id(Long metricId);

    // 🔹 By employee id THROUGH metric
    List<AnomalyFlagRecord> findByMetric_EmployeeId(Long employeeId);

    List<AnomalyFlagRecord> findByResolvedFalse();
}
