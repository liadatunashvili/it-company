package org.example;

import java.time.LocalDateTime;

public class Employee {
    private Long id;
    private String name;
    private String lastName;
    private double salary;
    private boolean active;
    private LocalDateTime birthDate;
    private LocalDateTime hireTime;
    private Department department;

    public Employee(Long id, String name, String lastName, double salary, boolean active, LocalDateTime birthDate, LocalDateTime hireTime, Department department) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.active = active;
        this.birthDate = birthDate;
        this.hireTime = hireTime;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getHireTime() {
        return hireTime;
    }

    public void setHireTime(LocalDateTime hireTime) {
        this.hireTime = hireTime;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
