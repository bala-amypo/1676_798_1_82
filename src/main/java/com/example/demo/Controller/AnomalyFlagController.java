package com.example.demo.controller;

import com.example.demo.entity.AnomalyFlagRecord;
import com.example.demo.service.AnomalyFlagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anomalies")
public class AnomalyFlagController {

    private final AnomalyFlagService service;

    public AnomalyFlagController(AnomalyFlagService service) {
        this.service = service;
    }

    @GetMapping
    public List<AnomalyFlagRecord> getAllFlags() {
        return service.getAllFlags();
    }

    @GetMapping("/employee/{employeeId}")
    public List<AnomalyFlagRecord> getFlagsByEmployee(
            @PathVariable Long employeeId) {
        return service.getFlagsByEmployee(employeeId);
    }

    @PutMapping("/{id}/resolve")
    public AnomalyFlagRecord resolve(@PathVariable Long id) {
        return service.resolveFlag(id);
    }
}
