insert into it_company(id, name, founded, active)
values (1, 'tech1', '1999-10-10', true),
       (2, 'tech2', '1998-10-09', true);

insert into client(id, name, email, phone)
values (1, 'newVision', 'newvision@gmail.com', '55783745634756384'),
       (2, 'itHub', 'ithub@gmail.com', '4365472365472635');

INSERT INTO contract (contract_details, contract_start_date, contract_finish_date, value)
VALUES ('system details', '2019-01-01', '2024-01-01', 100000),
       ('platform ', '2020-02-01', '2024-02-01', 200000);

INSERT INTO department (name, budget, it_company_id)
VALUES ('Development', 50000, 1),
       ('QA', 30000, 1);

INSERT INTO employee (name, last_name, salary, active, birth_date, hire_time, department_id)
VALUES ('Lia', 'Datunashvili', 3000, TRUE, '2002-17-12', NOW(), 1),
       ('Anna', 'enukidze', 3500, TRUE, '2003-17-09', NOW(), 2);

INSERT INTO project (name, budget, deadline, it_company_id, client_id, contract_id)
VALUES ('communicaiton chat', 100000, '2025-01-01', 1, 1, 1),
       ('Web application', 50000, '2025-06-01', 1, 2, 2);

INSERT INTO technology (name, version)
VALUES ('Java', '17'),
       ('java Spring', '3.0');

INSERT INTO project_technology (project_id, technology_id)
VALUES (1, 1),
       (1, 2),
       (2, 1);
INSERT INTO task (title, deadline, completed, project_id, employee_id)
VALUES ('Backend API', '2025-01-10', false, 1, 1),
       ('Testing', '2025-01-15', false, 1, 2);
INSERT INTO meeting (title, meeting_start_time, project_id)
VALUES ('Kickoff', '2026-01-01 10:00:00', 1),
       ('review of new feature', '2026-01-05 11:00:00', 2);
INSERT INTO meeting_employee (meeting_id, employee_id)
VALUES (1, 1),
       (1, 2),
       (2, 1);



