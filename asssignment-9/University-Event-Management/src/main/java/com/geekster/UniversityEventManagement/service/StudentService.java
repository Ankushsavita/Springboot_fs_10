package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public void addStudent(Student student) {
         studentRepo.save(student);
    }

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer studentId) {
        return studentRepo.findById(studentId);
    }

    public String updateDepartmentById(Integer studentId, Department department) {
        Optional<Student> myStudentOpt = studentRepo.findById(studentId);
        Student myStudent = null;
        if(myStudentOpt.isPresent()){
             myStudent = myStudentOpt.get();
        }else{
             return "Id not found!!";
        }
        myStudent.setDepartment(department);
        studentRepo.save(myStudent);
        return "student department updated";
    }

    public String deleteStudentById(Integer studentId) {
        studentRepo.deleteById(studentId);
        return "room deleted successfully of id "+ studentId;
    }
}
