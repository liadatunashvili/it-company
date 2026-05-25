update employee
set salary = salary + 500
where id = 1;

update client
set email = 'newEmailForCustomer2@gmail.com'
where id = 2;

UPDATE employee
SET active = FALSE
WHERE id = 2;

update meeting
set title = 'redesining web'
where id = 2;

update project
set budget = 1200
where id = 2;

UPDATE task
SET completed = TRUE
WHERE id = 1;

UPDATE client
SET phone = '9385204597240957204975024975'
WHERE id = 1;

UPDATE technology
SET version = '18'
WHERE id = 1;

UPDATE contract
SET value = value + 50000
WHERE id = 1;

DELETE
FROM task
WHERE id = 2;
DELETE
FROM meeting
WHERE id = 2;
DELETE
FROM employee
WHERE id = 2;
DELETE
FROM project_technology
WHERE project_id = 2;
DELETE
FROM project
WHERE id = 2;
DELETE
FROM client
WHERE id = 2;
DELETE
FROM technology
WHERE id = 2;
DELETE
FROM contract
WHERE id = 2;
DELETE
FROM department
WHERE id = 2;
DELETE
FROM it_company
WHERE id = 2;


select *
from it_company c
         join department d on c.id = d.it_company_id
         join employee e on d.id = e.department_id
         join project p on p.it_company_id = c.id
         join client cl on cl.id = p.client_id
         join contract con on con.id = p.contract_id
         join task t on t.project_id = p.id;



select e.name, d.name
from employee e
         left join department d on e.department_id = d.id;

SELECT e.name, d.name
FROM employee e
         RIGHT JOIN department d ON e.department_id = d.id;

SELECT e.name, d.name
FROM employee e
         INNER JOIN department d ON e.department_id = d.id;

SELECT e.name, d.name
FROM employee e
         LEFT JOIN department d ON e.department_id = d.id
UNION
SELECT e.name, d.name
FROM employee e
         RIGHT JOIN department d ON e.department_id = d.id;

SELECT p.name, t.name
FROM project p
         JOIN project_technology pt ON p.id = pt.project_id
         JOIN technology t ON t.id = pt.technology_id;


SELECT department_id, AVG(salary)
FROM employee
GROUP BY department_id;

SELECT department_id, SUM(salary)
FROM employee
GROUP BY department_id;

SELECT project_id, COUNT(*)
FROM task
GROUP BY project_id;

SELECT it_company_id, COUNT(*)
FROM department
GROUP BY it_company_id;

SELECT project_id, COUNT(*)
FROM project_technology
GROUP BY project_id;

SELECT employee_id, COUNT(*)
FROM task
GROUP BY employee_id;

SELECT department_id, MAX(salary)
FROM employee
GROUP BY department_id;


SELECT department_id, AVG(salary)
FROM employee
GROUP BY department_id
HAVING AVG(salary) > 3000;

SELECT department_id, SUM(salary)
FROM employee
GROUP BY department_id
HAVING SUM(salary) > 3000;

SELECT project_id, COUNT(*)
FROM task
GROUP BY project_id
HAVING COUNT(*) > 1;

SELECT it_company_id, COUNT(*)
FROM department
GROUP BY it_company_id
HAVING COUNT(*) >= 2;

SELECT employee_id, COUNT(*)
FROM task
GROUP BY employee_id
HAVING COUNT(*) >= 1;

SELECT project_id, COUNT(*)
FROM project_technology
GROUP BY project_id
HAVING COUNT(*) > 1;

SELECT department_id, MAX(salary)
FROM employee
GROUP BY department_id
HAVING MAX(salary) > 3200;

