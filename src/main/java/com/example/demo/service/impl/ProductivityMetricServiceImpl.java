package com.example.demo.service.impl;

import com.example.demo.entity.ProductivityMetricRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ProductivityMetricRecordRepository;
import com.example.demo.service.ProductivityMetricService;
import com.example.demo.util.ProductivityCalculator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductivityMetricServiceImpl implements ProductivityMetricService {

    private final ProductivityMetricRecordRepository repository;

    public ProductivityMetricServiceImpl(ProductivityMetricRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductivityMetricRecord record(ProductivityMetricRecord record) {
        repository.findByEmployeeIdAndDate(record.getEmployeeId(), record.getDate())
                .ifPresent(r -> {
                    throw new IllegalStateException("Metric already exists");
                });

        double score = ProductivityCalculator.compute(
                record.getHoursLogged(),
                record.getTasksCompleted(),
                record.getMeetingsAttended()
        );
        record.setProductivityScore(score);

        return repository.save(record);
    }

    @Override
    public ProductivityMetricRecord update(Long id, ProductivityMetricRecord updated) {
        ProductivityMetricRecord existing = getMetricById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Metric not found"));

        existing.setHoursLogged(updated.getHoursLogged());
        existing.setTasksCompleted(updated.getTasksCompleted());
        existing.setMeetingsAttended(updated.getMeetingsAttended());

        double score = ProductivityCalculator.compute(
                updated.getHoursLogged(),
                updated.getTasksCompleted(),
                updated.getMeetingsAttended()
        );
        existing.setProductivityScore(score);

        return repository.save(existing);
    }

    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    @Override
    public Optional<ProductivityMetricRecord> getMetricById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return repository.findAll();
    }
}
