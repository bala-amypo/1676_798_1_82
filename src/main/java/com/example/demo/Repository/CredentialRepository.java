package com.example.demo.repository;

import com.example.demo.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CredentialRepository
        extends JpaRepository<Credential, Long> {

    Optional<Credential> findByCredentialId(String credentialId);

    List<Credential> findByEmployee_Id(Long employeeId);
}
