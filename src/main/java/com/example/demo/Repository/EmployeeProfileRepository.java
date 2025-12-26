package com.example.demo.repository;

import com.example.demo.entity.EmployeeProfile;

import java.util.Optional;

public interface EmployeeProfileRepository {

    Optional<EmployeeProfile> findByEmployeeId(String employeeId);

}
