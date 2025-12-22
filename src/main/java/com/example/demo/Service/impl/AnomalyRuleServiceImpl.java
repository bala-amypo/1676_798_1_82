package com.example.demo.service.impl;

import com.example.demo.entity.AnomalyRule;
import com.example.demo.repository.AnomalyRuleRepository;
import com.example.demo.service.AnomalyRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnomalyRuleServiceImpl implements AnomalyRuleService {

    private final AnomalyRuleRepository repository;

    public AnomalyRuleServiceImpl(AnomalyRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AnomalyRule> getAll() {
        return repository.findAll();
    }

    @Override
    public AnomalyRule save(AnomalyRule rule) {
        return repository.save(rule);
    }
}
