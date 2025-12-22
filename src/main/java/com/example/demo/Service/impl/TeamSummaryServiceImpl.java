package com.example.demo.service.impl;

import com.example.demo.entity.TeamSummaryRecord;
import com.example.demo.repository.TeamSummaryRecordRepository;
import com.example.demo.service.TeamSummaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamSummaryServiceImpl implements TeamSummaryService {

    private final TeamSummaryRecordRepository repository;

    public TeamSummaryServiceImpl(TeamSummaryRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TeamSummaryRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public TeamSummaryRecord save(TeamSummaryRecord record) {
        return repository.save(record);
    }
}
