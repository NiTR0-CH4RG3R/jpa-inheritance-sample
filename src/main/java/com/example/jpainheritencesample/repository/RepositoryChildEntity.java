package com.example.jpainheritencesample.repository;

import com.example.jpainheritencesample.entity.ChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryChildEntity extends JpaRepository<ChildEntity, Long> {
}
