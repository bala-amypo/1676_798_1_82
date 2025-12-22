package com.example.demo.service;

import com.example.demo.entity.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRepository;
import com.example.demo.util.ProductivityCalculator;
import org.springframework.stereotype.Service;

@Service
public class ProductivityService {

    private final ProductivityMetricRepository repository;

    public ProductivityService(ProductivityMetricRepository repository) {
        this.repository = repository;
    }

    public ProductivityMetricRecord save(ProductivityMetricRecord record) {
        double score = ProductivityCalculator.calculate(
                record.getHoursLogged(),
                record.getTasksCompleted()
        );
        record.setProductivityScore(score);
        return repository.save(record);
    }
}
