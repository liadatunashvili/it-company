package org.example;

import java.time.LocalDateTime;

public class Project {
    private Long id;
    private String name;
    private double budget;
    private LocalDateTime deadline;
    private Department department;

    public Project(Long id, String name, double budget, LocalDateTime deadline, Department department) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.deadline = deadline;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
