package org.example;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private LocalDateTime deadline;
    private boolean completed;
    private Employee employee;

    public Task(Long id, String title, LocalDateTime deadline,
                boolean completed, Employee employee) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.completed = completed;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}