package com.example.jpainheritencesample.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AnotherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ChildEntity childEntity;
}