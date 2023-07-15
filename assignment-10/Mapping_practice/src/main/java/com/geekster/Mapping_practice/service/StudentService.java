package com.geekster.Mapping_practice.service;

import com.geekster.Mapping_practice.model.Student;
import com.geekster.Mapping_practice.repository.IStudentRepo;
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

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


    public String removeStudentById(Long studentId) {
        studentRepo.deleteById(studentId);
        return "student deleted successfully" + studentId;
    }

    public String updateStudentById(Long studentId, Student newStudent) {
        Optional<Student> myStudentOpt = studentRepo.findById(studentId);

        Student myStudent = null;

        if(myStudentOpt.isPresent()){
            myStudent = myStudentOpt.get();
        }else{
            return "id not found";
        }

        myStudent.setStudentId(newStudent.getStudentId());
        myStudent.setStudentName(newStudent.getStudentName());
        myStudent.setStudentPhoneNumber(newStudent.getStudentPhoneNumber());
        myStudent.setStudentAge(newStudent.getStudentAge());
        myStudent.setStudentBranch(newStudent.getStudentBranch());
        myStudent.setStudentDepartment(newStudent.getStudentDepartment());
        myStudent.setAddress(newStudent.getAddress());

         studentRepo.save(myStudent);
         return "student updated";
    }


}
