CREATE TABLE meat_keywords (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    work_unit_id BIGINT,
    category VARCHAR(50), -- MONITORING, EVALUATION, ASSESSMENT, TREATMENT
    keyword VARCHAR(255),
    FOREIGN KEY (work_unit_id) REFERENCES work_units(id)
);
