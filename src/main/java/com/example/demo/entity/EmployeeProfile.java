package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_profile")
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private boolean active; // <-- add this field

    // Other fields...

    // Getter and setter for 'active'
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Getters and setters for other fields...
}
