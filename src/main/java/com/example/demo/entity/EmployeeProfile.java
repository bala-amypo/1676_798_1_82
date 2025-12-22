package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class EmployeeProfile {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String department;
}
