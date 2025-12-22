package com.example.demo.service;

import com.example.demo.entity.AnomalyFlagRecord;
import java.util.List;

public interface AnomalyFlagService {
    List<AnomalyFlagRecord> getAll();
    AnomalyFlagRecord save(AnomalyFlagRecord record);
}
