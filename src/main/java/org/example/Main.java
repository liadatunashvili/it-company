package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1L, "`Lika`", "Datunashvili", 3000, true,
                LocalDate.of(2002, 12, 17),
                LocalDateTime.of(2021, 3, 15, 9, 0));

        Employee emp2 = new Employee(2L, "Elene", "Enukidze", 3800.0, true,
                LocalDate.of(2003, 8, 10),
                LocalDateTime.of(2022, 7, 1, 9, 0));

        Department dept = new Department(1L, "Software engineering", 50000.0, List.of(emp1, emp2));

        Client client = new Client(1L, "Georgian group", "georgiangroup@acme.com", "+995 5689242344234234");

        Contract contract = new Contract(1L, "web build",
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 12, 31), 75000.0);

        Technology java = new Technology(1L, "Java", "17");
        Technology react = new Technology(2L, "React", "18.2");

        Task task1 = new Task(1L, "Build login page",
                LocalDateTime.of(2026, 3, 1, 18, 0), false, emp1);

        Meeting meeting1 = new Meeting(1L, "Kickoff",
                LocalDateTime.of(2026, 1, 5, 10, 0), List.of(emp1, emp2));

        Project project = new Project(1L, "Portal Redesign", 75000.0,
                LocalDateTime.of(2026, 12, 31, 18, 0),
                client, contract,
                List.of(task1), List.of(meeting1), List.of(java, react));

        ItCompany company = new ItCompany(1L, "TechLia",
                LocalDate.of(2015, 6, 1), true,
                List.of(project), List.of(dept));

        System.out.println("Company: " + company.getName());
        System.out.println("Department: " + dept.getName());
        System.out.println("Employee: " + emp1.getName() + " | Active: " + emp1.isActive());
        System.out.println("Task: " + task1.getTitle() + " | Done: " + task1.isCompleted());
        System.out.println("Meeting: " + meeting1.getTitle());
    }
}