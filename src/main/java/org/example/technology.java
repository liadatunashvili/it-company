package org.example;

import java.util.List;

public class technology {
    private Long id;
    private String name;
    private String version;
    private Project project;

    public technology(Long id, String name, String version, Project project) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.project = project;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
