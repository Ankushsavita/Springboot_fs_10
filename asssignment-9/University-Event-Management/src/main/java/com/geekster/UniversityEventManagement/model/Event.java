package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Event")
public class Event {
    @Id
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String startTime;
    private String endTime;
}
