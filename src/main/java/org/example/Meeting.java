package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Meeting {
    private Long id;
    private String title;
    private LocalDateTime meetingStartTime;
    private List<Employee> attendees;

    public Meeting(Long id, String title, LocalDateTime meetingStartTime,
                   List<Employee> attendees) {
        this.id = id;
        this.title = title;
        this.meetingStartTime = meetingStartTime;
        this.attendees = attendees;
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

    public LocalDateTime getMeetingStartTime() {
        return meetingStartTime;
    }

    public void setMeetingStartTime(LocalDateTime meetingStartTime) {
        this.meetingStartTime = meetingStartTime;
    }

    public List<Employee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Employee> attendees) {
        this.attendees = attendees;
    }
}