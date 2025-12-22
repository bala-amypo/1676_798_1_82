package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Credential;

public interface CredentialRepository
        extends JpaRepository<Credential, Long> {
}
