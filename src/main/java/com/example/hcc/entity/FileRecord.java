package com.example.hcc.entity;

import com.example.hcc.enums.UploadStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "files")
@Getter
@Setter
public class FileRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Project project;

    private String fileName;

    @Column(name = "s3_path")
    private String s3Path;
    private Integer totalPages;

    @Enumerated(EnumType.STRING)
    private UploadStatus uploadStatus;
}
