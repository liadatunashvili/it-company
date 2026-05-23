package org.example;

public class Department {
    private Long id;
    private String name;
    private double budget;
    private ItCompany company;

    public Department(Long id, String name, double budget, ItCompany company) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.company = company;
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

    public ItCompany getCompany() {
        return company;
    }

    public void setCompany(ItCompany company) {
        this.company = company;
    }
}
