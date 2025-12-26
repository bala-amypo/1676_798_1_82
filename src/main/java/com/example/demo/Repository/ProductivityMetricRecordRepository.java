package com.example.demo.repository;

import com.example.demo.model.ProductivityMetricRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductivityMetricRecordRepository extends JpaRepository<ProductivityMetricRecord, Long> {
    /**
     * Used by Test 32 to retrieve metrics for a specific employee database ID
     */
    List<ProductivityMetricRecord> findByEmployeeId(Long employeeId);
}