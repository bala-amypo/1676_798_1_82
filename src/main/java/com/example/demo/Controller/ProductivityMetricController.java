package com.example.demo.controller;

import com.example.demo.entity.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metrics")
public class ProductivityMetricController {

    private final ProductivityMetricService service;

    public ProductivityMetricController(ProductivityMetricService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductivityMetricRecord> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ProductivityMetricRecord save(@RequestBody ProductivityMetricRecord r) {
        return service.save(r);
    }
}
