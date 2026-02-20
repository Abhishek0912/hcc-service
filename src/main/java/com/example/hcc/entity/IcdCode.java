package com.example.hcc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "icd_codes")
@Getter
@Setter
public class IcdCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "icd_code")
    private String icdCode;

    private String description;
}
