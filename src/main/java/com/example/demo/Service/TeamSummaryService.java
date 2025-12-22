package com.example.demo.service;

import com.example.demo.entity.TeamSummaryRecord;
import java.util.List;

public interface TeamSummaryService {
    List<TeamSummaryRecord> getAll();
    TeamSummaryRecord save(TeamSummaryRecord record);
}
