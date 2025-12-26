package com.example.demo.repository;

import com.example.demo.entity.AnomalyFlagRecord;

import java.util.List;

public interface AnomalyFlagRecordRepository {

    List<AnomalyFlagRecord> findByMetricId(Long metricId);

    List<AnomalyFlagRecord> findAll();

}
