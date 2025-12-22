package com.example.demo.service;

import com.example.demo.entity.ProductivityMetricRecord;
import java.util.List;

public interface ProductivityMetricService {
    List<ProductivityMetricRecord> getAll();
    ProductivityMetricRecord save(ProductivityMetricRecord record);
}
