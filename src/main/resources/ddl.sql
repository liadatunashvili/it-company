CREATE DATABASE IF NOT EXISTS it_company_db;
USE it_company_db;

CREATE TABLE it_company (
                            id      BIGINT AUTO_INCREMENT PRIMARY KEY,
                            name    VARCHAR(200) NOT NULL,
                            founded DATE         NOT NULL,
                            active  BOOLEAN      NOT NULL DEFAULT TRUE
);

CREATE TABLE department (
                            id            BIGINT       AUTO_INCREMENT PRIMARY KEY,
                            name          VARCHAR(150) NOT NULL,
                            budget        DOUBLE       NOT NULL,
                            it_company_id BIGINT       NOT NULL,
                            FOREIGN KEY (it_company_id) REFERENCES it_company(id)
);

CREATE TABLE employee (
                          id            BIGINT       AUTO_INCREMENT PRIMARY KEY,
                          name          VARCHAR(100) NOT NULL,
                          last_name     VARCHAR(100) NOT NULL,
                          salary        DOUBLE       NOT NULL,
                          active        BOOLEAN      NOT NULL DEFAULT TRUE,
                          birth_date    DATE         NOT NULL,
                          hire_time     DATETIME     NOT NULL,
                          department_id BIGINT       NOT NULL,
                          FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE client (
                        id    BIGINT       AUTO_INCREMENT PRIMARY KEY,
                        name  VARCHAR(200) NOT NULL,
                        email VARCHAR(200) NOT NULL,
                        phone VARCHAR(50)
);

CREATE TABLE contract (
                          id                   BIGINT AUTO_INCREMENT PRIMARY KEY,
                          contract_details     TEXT   NOT NULL,
                          contract_start_date  DATE   NOT NULL,
                          contract_finish_date DATE   NOT NULL,
                          value                DOUBLE NOT NULL
);

CREATE TABLE project (
                         id            BIGINT       AUTO_INCREMENT PRIMARY KEY,
                         name          VARCHAR(200) NOT NULL,
                         budget        DOUBLE       NOT NULL,
                         deadline      DATETIME     NOT NULL,
                         it_company_id BIGINT       NOT NULL,
                         client_id     BIGINT       NOT NULL,
                         contract_id   BIGINT       NOT NULL,
                         FOREIGN KEY (it_company_id) REFERENCES it_company(id),
                         FOREIGN KEY (client_id)     REFERENCES client(id),
                         FOREIGN KEY (contract_id)   REFERENCES contract(id)
);

CREATE TABLE technology (
                            id      BIGINT       AUTO_INCREMENT PRIMARY KEY,
                            name    VARCHAR(100) NOT NULL,
                            version VARCHAR(50)  NOT NULL
);

CREATE TABLE project_technology (
                                    project_id    BIGINT NOT NULL,
                                    technology_id BIGINT NOT NULL,
                                    PRIMARY KEY (project_id, technology_id),
                                    FOREIGN KEY (project_id)    REFERENCES project(id),
                                    FOREIGN KEY (technology_id) REFERENCES technology(id)
);

CREATE TABLE task (
                      id          BIGINT       AUTO_INCREMENT PRIMARY KEY,
                      title       VARCHAR(200) NOT NULL,
                      deadline    DATETIME     NOT NULL,
                      completed   BOOLEAN      NOT NULL DEFAULT FALSE,
                      project_id  BIGINT       NOT NULL,
                      employee_id BIGINT,
                      FOREIGN KEY (project_id)  REFERENCES project(id),
                      FOREIGN KEY (employee_id) REFERENCES employee(id)
);

CREATE TABLE meeting (
                         id                 BIGINT       AUTO_INCREMENT PRIMARY KEY,
                         title              VARCHAR(200) NOT NULL,
                         meeting_start_time DATETIME     NOT NULL,
                         project_id         BIGINT       NOT NULL,
                         FOREIGN KEY (project_id) REFERENCES project(id)
);

CREATE TABLE meeting_employee (
                                  meeting_id  BIGINT NOT NULL,
                                  employee_id BIGINT NOT NULL,
                                  PRIMARY KEY (meeting_id, employee_id),
                                  FOREIGN KEY (meeting_id)  REFERENCES meeting(id),
                                  FOREIGN KEY (employee_id) REFERENCES employee(id)
);