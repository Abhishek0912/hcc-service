package com.example.hcc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "coder_sessions")
@Getter
@Setter
public class CoderSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "work_unit_id")
    private Long workUnitId;

    @Column(name = "coder_id")
    private Long coderId;

    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
}

