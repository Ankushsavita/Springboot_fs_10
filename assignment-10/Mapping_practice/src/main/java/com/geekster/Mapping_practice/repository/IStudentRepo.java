package com.geekster.Mapping_practice.repository;

import com.geekster.Mapping_practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Long> {
}
