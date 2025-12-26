package com.example.demo.repository;

import com.example.demo.model.AnomalyRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnomalyRuleRepository extends JpaRepository<AnomalyRule, String> {
    /**
     * Used by Test 45 to find active detection rules
     */
    List<AnomalyRule> findByActiveTrue();
}