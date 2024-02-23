package com.example.jpainheritencesample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "child_entity_id")
public class ChildEntity extends ParentEntity {
}
