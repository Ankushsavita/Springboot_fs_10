package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("event")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }

    @PutMapping("events/{eventId}")
    public String updateEventById(@PathVariable Integer eventId, @RequestBody Event event){
        return eventService.updateEventById(eventId, event);
    }

    @DeleteMapping("event/{eventId}")
    public String deleteEventById(@PathVariable Integer eventId){
        return eventService.deleteEventById(eventId);
    }

    @GetMapping("events/{date}")
    public Optional<Event> getEventByDate(@PathVariable String date){
        return eventService.getEventByDate(date);
    }
}
