package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TeamSummaryRecord;

public interface TeamSummaryRecordRepository
        extends JpaRepository<TeamSummaryRecord, Long> {
}
