package com.example.demo.service.impl;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.repository.EmployeeProfileRepository;
import com.example.demo.service.EmployeeProfileService;

import java.util.Optional;

public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    private final EmployeeProfileRepository repository;

    public EmployeeProfileServiceImpl(EmployeeProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        return employee;
    }

    @Override
    public EmployeeProfile getEmployeeById(Long id) {
        throw new RuntimeException("Employee not found");
    }

    @Override
    public Optional<EmployeeProfile> findByEmployeeId(String employeeId) {
        return Optional.empty();
    }

    @Override
    public EmployeeProfile updateEmployeeStatus(Long id, boolean active) {
        EmployeeProfile e = new EmployeeProfile();
        e.setActive(active);
        return e;
    }
}
