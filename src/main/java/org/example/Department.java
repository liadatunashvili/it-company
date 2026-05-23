package org.example;

import java.util.List;

public class Department {
    private Long id;
    private String name;
    private double budget;
    private List<Employee> employees;

    public Department(Long id, String name, double budget, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}