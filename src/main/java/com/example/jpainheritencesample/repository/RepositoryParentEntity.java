package com.example.jpainheritencesample.repository;

import com.example.jpainheritencesample.entity.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryParentEntity extends JpaRepository<ParentEntity, Long> {
}
