package com.example.demo.controller;

import com.example.demo.entity.TeamSummaryRecord;
import com.example.demo.service.TeamSummaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamSummaryController {

    private final TeamSummaryService service;

    public TeamSummaryController(TeamSummaryService service) {
        this.service = service;
    }

    @GetMapping
    public List<TeamSummaryRecord> getAll() {
        return service.getAll();
    }

    @PostMapping
    public TeamSummaryRecord save(@RequestBody TeamSummaryRecord r) {
        return service.save(r);
    }
}
