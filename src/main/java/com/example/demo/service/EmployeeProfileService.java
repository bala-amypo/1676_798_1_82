package com.example.demo.service;

import com.example.demo.entity.EmployeeProfile;
import java.util.List;

public interface EmployeeProfileService {
    List<EmployeeProfile> getAll();
    EmployeeProfile save(EmployeeProfile profile);
}
