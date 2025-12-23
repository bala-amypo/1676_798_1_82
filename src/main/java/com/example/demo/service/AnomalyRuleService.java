package com.example.demo.service;

import com.example.demo.entity.AnomalyRule;

import java.util.List;
import java.util.Optional;

public interface AnomalyRuleService {

    AnomalyRule create(AnomalyRule rule);

    AnomalyRule update(Long id, AnomalyRule updated);

    List<AnomalyRule> getActiveRules();

    Optional<AnomalyRule> getRuleByCode(String ruleCode);

    List<AnomalyRule> getAllRules();
}
