package com.geekster.Mapping_practice.controller;

import com.geekster.Mapping_practice.model.Student;
import com.geekster.Mapping_practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("student/{studentId}")
    public String updateStudentById(@PathVariable Long studentId, @RequestBody Student newStudent){
        return studentService.updateStudentById(studentId, newStudent);
    }

    @DeleteMapping("students/{studentId}")
    public String removeStudentById(@PathVariable Long studentId){
        return studentService.removeStudentById(studentId);
    }
}
