package com.example.demo.controller;

import com.example.demo.entity.AnomalyFlagRecord;
import com.example.demo.service.AnomalyFlagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anomaly-flags")
public class AnomalyFlagController {

    private final AnomalyFlagService service;

    public AnomalyFlagController(AnomalyFlagService service) {
        this.service = service;
    }

    @GetMapping
    public List<AnomalyFlagRecord> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AnomalyFlagRecord save(@RequestBody AnomalyFlagRecord r) {
        return service.save(r);
    }
}
