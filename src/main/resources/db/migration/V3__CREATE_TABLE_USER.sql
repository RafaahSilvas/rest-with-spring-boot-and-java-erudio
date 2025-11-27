CREATE TABLE user (
  id BIGINT NOT NULL AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  id_person BIGINT NOT NULL,
  role VARCHAR(50) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_user_email (email),
  KEY idx_user_person (id_person),
  CONSTRAINT fk_user_person FOREIGN KEY (id_person) REFERENCES person(id)
    ON DELETE RESTRICT ON UPDATE CASCADE
);