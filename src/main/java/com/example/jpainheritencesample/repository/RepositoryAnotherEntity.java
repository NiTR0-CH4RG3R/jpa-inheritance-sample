package com.example.jpainheritencesample.repository;

import com.example.jpainheritencesample.entity.AnotherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAnotherEntity extends JpaRepository<AnotherEntity, Long> {
}
