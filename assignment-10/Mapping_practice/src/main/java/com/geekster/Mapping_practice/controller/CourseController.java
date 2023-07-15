package com.geekster.Mapping_practice.controller;

import com.geekster.Mapping_practice.model.Book;
import com.geekster.Mapping_practice.model.Course;
import com.geekster.Mapping_practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @GetMapping("courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PutMapping("course/{courseId}")
    public String updateCourseById(@PathVariable Long courseId, @RequestBody Course newCourse){
        return courseService.updateCourseById(courseId, newCourse);
    }

    @DeleteMapping("courses/{courseId}")
    public String removeCourseById(@PathVariable Long courseId){
        return courseService.removeCourseById(courseId);
    }
}
