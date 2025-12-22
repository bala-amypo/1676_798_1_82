package com.example.demo.service.impl;

import com.example.demo.entity.AnomalyFlagRecord;
import com.example.demo.repository.AnomalyFlagRecordRepository;
import com.example.demo.service.AnomalyFlagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnomalyFlagServiceImpl implements AnomalyFlagService {

    private final AnomalyFlagRecordRepository repository;

    public AnomalyFlagServiceImpl(AnomalyFlagRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AnomalyFlagRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public AnomalyFlagRecord save(AnomalyFlagRecord record) {
        return repository.save(record);
    }
}
