package org.example;

import java.time.LocalDate;
import java.util.List;

public class ItCompany {
    private Long id;
    private String name;
    private LocalDate founded;
    private boolean active;

    private List<Project> projects;
    private List<Department> departments;


    public ItCompany(Long id, String name, LocalDate founded, boolean active, List<Project> projects, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.founded = founded;
        this.active = active;
        this.projects = projects;
        this.departments = departments;
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

    public LocalDate getFounded() {
        return founded;
    }

    public void setFounded(LocalDate founded) {
        this.founded = founded;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
