package com.example.demo.service.impl;

import com.example.demo.entity.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRecordRepository;
import com.example.demo.service.ProductivityMetricService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductivityMetricServiceImpl implements ProductivityMetricService {

    private final ProductivityMetricRecordRepository repository;

    public ProductivityMetricServiceImpl(ProductivityMetricRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductivityMetricRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductivityMetricRecord save(ProductivityMetricRecord record) {
        return repository.save(record);
    }
}
