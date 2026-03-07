package com.example.hcc.dto;

import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class DataExtractionDto {
    private String fileName;
    private String s3Path;
    private Integer totalPages;
    private String signature;
    private String credentials;
    private String projectName;
    private String projectType;
    private String dos;
    private String dob;
    private String firstName;
    private String lastName;
    private Long projectId;
    private String workUnitType;
    private Long workId;
    private List<EncounterDetailDto> details;
    private String dbStatus;

    @Data
    public static class EncounterDetailDto {
        private String dos;
        private List<String> extractedIcdCodes;
        private List<String> aiSuggestedIcdCode;
        private Boolean monitor;
        private Boolean evaluate;
        private Boolean assessOrAddress;
        private Boolean treat;
        private List<String> monitoringKeywords;
        private List<String> evaluationKeywords;
        private List<String> assessmentKeywords;
        private List<String> treatmentKeywords;
        private Map<String, MeatValidationDto> meatValidation;
    }

    @Data
    public static class MeatValidationDto {
        private List<String> keywords;
        private Double weight;
    }
}
