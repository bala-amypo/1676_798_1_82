package com.example.demo.repository;

import com.example.demo.entity.ProductivityMetricRecord;

import java.util.List;

public interface ProductivityMetricRecordRepository {

    List<ProductivityMetricRecord> findByEmployeeId(Long employeeId);

}
