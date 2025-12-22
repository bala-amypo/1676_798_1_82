package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CredentialVerificationEvent;

public interface CredentialVerificationEventRepository
        extends JpaRepository<CredentialVerificationEvent, Long> {
}
