package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.example.demo.repository.ProductivityMetricRecordRepository;
import com.example.demo.util.ProductivityCalculator;
import com.example.demo.entity.AnomalyFlagRecord;

@Service
@RequiredArgsConstructor
public class ProductivityMetricServiceImpl {

    private final ProductivityMetricRecordRepository repository;

    public int calculate(int completed, int pending, int overdue) {
        return ProductivityCalculator.compute(completed, pending, overdue);
    }

    public void flagRule(AnomalyFlagRecord flag) {
        flag.setRuleCode("LOW_PRODUCTIVITY");
    }
}
