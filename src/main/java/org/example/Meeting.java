package org.example;

import java.time.LocalDateTime;

public class Meeting {
   private Long id;
   private String title;
   private LocalDateTime meetingStartTime;
   private Employee employee;

   public Meeting(Long id, String title, LocalDateTime meetingStartTime, Employee employee) {
      this.id = id;
      this.title = title;
      this.meetingStartTime = meetingStartTime;
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

   public LocalDateTime getMeetingStartTime() {
      return meetingStartTime;
   }

   public void setMeetingStartTime(LocalDateTime meetingStartTime) {
      this.meetingStartTime = meetingStartTime;
   }

   public Employee getEmployee() {
      return employee;
   }

   public void setEmployee(Employee employee) {
      this.employee = employee;
   }
}
