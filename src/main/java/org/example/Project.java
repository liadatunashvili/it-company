package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Project {
    private Long id;
    private String name;
    private double budget;
    private LocalDateTime deadline;
    private Client client;
    private Contract contract;
    private List<Task> tasks;
    private List<Meeting> meetings;
    private List<Technology> technologies;

    public Project(Long id, String name, double budget, LocalDateTime deadline,
                   Client client, Contract contract,
                   List<Task> tasks, List<Meeting> meetings, List<Technology> technologies) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.deadline = deadline;
        this.client = client;
        this.contract = contract;
        this.tasks = tasks;
        this.meetings = meetings;
        this.technologies = technologies;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }
}