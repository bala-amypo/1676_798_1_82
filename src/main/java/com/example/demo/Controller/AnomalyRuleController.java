package com.example.demo.controller;

import com.example.demo.entity.AnomalyRule;
import com.example.demo.service.AnomalyRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anomaly-rules")
public class AnomalyRuleController {

    private final AnomalyRuleService service;

    public AnomalyRuleController(AnomalyRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<AnomalyRule> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AnomalyRule save(@RequestBody AnomalyRule rule) {
        return service.save(rule);
    }
}
