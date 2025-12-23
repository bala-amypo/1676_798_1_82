package com.example.demo.service.impl;

import com.example.demo.entity.AnomalyRule;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AnomalyRuleRepository;
import com.example.demo.service.AnomalyRuleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnomalyRuleServiceImpl implements AnomalyRuleService {

    private final AnomalyRuleRepository repository;

    public AnomalyRuleServiceImpl(AnomalyRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnomalyRule create(AnomalyRule rule) {
        return repository.save(rule);
    }

    @Override
    public AnomalyRule update(Long id, AnomalyRule updated) {
        AnomalyRule rule = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));

        rule.setDescription(updated.getDescription());
        rule.setThresholdValue(updated.getThresholdValue());
        rule.setActive(updated.getActive());

        return repository.save(rule);
    }

    @Override
    public List<AnomalyRule> getActiveRules() {
        return repository.findByActiveTrue();
    }

    @Override
    public Optional<AnomalyRule> getRuleByCode(String ruleCode) {
        return repository.findByRuleCode(ruleCode);
    }

    @Override
    public List<AnomalyRule> getAllRules() {
        return repository.findAll();
    }
}
