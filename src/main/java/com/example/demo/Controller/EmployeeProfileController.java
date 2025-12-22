package com.example.demo.controller;

import com.example.demo.entity.EmployeeProfile;
import com.example.demo.service.EmployeeProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeProfileController {

    private final EmployeeProfileService service;

    public EmployeeProfileController(EmployeeProfileService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeProfile> getAll() {
        return service.getAll();
    }

    @PostMapping
    public EmployeeProfile save(@RequestBody EmployeeProfile e) {
        return service.save(e);
    }
}
