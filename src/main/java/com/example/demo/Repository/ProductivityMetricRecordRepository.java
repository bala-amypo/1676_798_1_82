package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.util.ProductivityCalculator;

@Service
public class ProductivityMetricServiceImpl {

    public void processMetric(EmployeeProfile employee,
                              ProductivityMetricRecord metric,
                              AnomalyRule rule,
                              AnomalyFlagRecord flag) {

        double score = ProductivityCalculator.calculate(
                metric.getHoursLogged(),
                metric.getTasksCompleted(),
                metric.getMeetingsAttended()
        );

        metric.setEmployee(employee);
        metric.setProductivityScore(score);

        if (score < rule.getThresholdValue()) {
            flag.setEmployee(employee);
            flag.setMetric(metric);
            flag.setSeverity("HIGH");
            flag.setDetails("Rule triggered: " + rule.getRuleCode());
        }
    }
}
