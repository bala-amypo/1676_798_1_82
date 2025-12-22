package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.util.ProductivityCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductivityMetricServiceImpl {

    private final ProductivityMetricRecordRepository metricRepo;
    private final EmployeeProfileRepository employeeRepo;
    private final AnomalyRuleRepository ruleRepo;
    private final AnomalyFlagRecordRepository flagRepo;

    public ProductivityMetricRecord recordMetric(
            ProductivityMetricRecord metric, String employeeId) {

        EmployeeProfile employee = employeeRepo.findByEmployeeId(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        metricRepo.findByEmployee_IdAndDate(employee.getId(), metric.getDate())
                .ifPresent(m -> {
                    throw new IllegalStateException("Metric already exists");
                });

        double score = ProductivityCalculator.compute(
                metric.getHoursLogged(),
                metric.getTasksCompleted(),
                metric.getMeetingsAttended()
        );

        metric.setEmployee(employee);
        metric.setProductivityScore(score);

        ProductivityMetricRecord saved = metricRepo.save(metric);

        for (AnomalyRule rule : ruleRepo.findByActiveTrue()) {
            if (score < rule.getThresholdValue()) {
                AnomalyFlagRecord flag = new AnomalyFlagRecord();
                flag.setEmployee(employee);
                flag.setMetric(saved);
                flag.setRuleCode(rule.getRuleCode());
                flag.setSeverity("LOW");
                flag.setDetails("Score below threshold");
                flagRepo.save(flag);
            }
        }
        return saved;
    }
}
