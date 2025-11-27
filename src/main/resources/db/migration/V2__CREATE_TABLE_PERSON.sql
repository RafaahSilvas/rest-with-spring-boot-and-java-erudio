CREATE TABLE person (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100),
  cpf CHAR(11) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE person ADD CONSTRAINT uq_person_cpf UNIQUE (cpf);
CREATE INDEX idx_person_first_name ON person (first_name);
CREATE INDEX idx_person_cpf ON person (cpf);