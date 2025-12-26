package com.example.demo.repository;

import com.example.demo.model.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {
    /**
     * Used by Test 31 & 16 to find employee by their string-based ID
     */
    Optional<EmployeeProfile> findByEmployeeId(String employeeId);
}