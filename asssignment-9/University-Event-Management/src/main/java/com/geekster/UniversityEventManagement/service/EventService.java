package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService {

    @Autowired
    IEventRepo eventRepo;

    public void addEvent(Event event) {
        eventRepo.save(event);
    }

    public String updateEventById(Integer eventId, Event event) {
        Optional<Event> myEventOpt = eventRepo.findById(eventId);
        Event myEvent= null;
        if(myEventOpt.isPresent()){
            myEvent = myEventOpt.get();
        }else{
            return "Id not found!!";
        }
        myEvent.setEventId(event.getEventId());
        myEvent.setEventName(event.getEventName());
        myEvent.setLocationOfEvent(event.getLocationOfEvent());
        myEvent.setDate(event.getDate());
        myEvent.setStartTime(event.getStartTime());
        myEvent.setEndTime(event.getEndTime());
        eventRepo.save(myEvent);
        return "event updated";
    }

    public String deleteEventById(Integer eventId) {
        eventRepo.deleteById(eventId);
        return "event deleted successfully of id "+ eventId;
    }

    public Optional<Event> getEventByDate(String date) {
        return eventRepo.findByDate(date);
    }
}
