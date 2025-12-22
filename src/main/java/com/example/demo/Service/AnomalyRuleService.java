package com.example.demo.service;

import com.example.demo.entity.AnomalyRule;
import java.util.List;

public interface AnomalyRuleService {
    List<AnomalyRule> getAll();
    AnomalyRule save(AnomalyRule rule);
}
