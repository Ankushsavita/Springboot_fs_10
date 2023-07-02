package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
         studentService.addStudent(student);
    }

    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("students/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }

    @PutMapping("student/{studentId}/{department}")
    public String updateDepartmentById(@PathVariable Integer studentId, @PathVariable Department department){
        return studentService.updateDepartmentById(studentId,department);
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudentById(@PathVariable Integer studentId){
        return studentService.deleteStudentById(studentId);
    }
}
