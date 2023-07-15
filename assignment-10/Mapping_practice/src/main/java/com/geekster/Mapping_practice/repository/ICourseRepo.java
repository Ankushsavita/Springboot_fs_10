package com.geekster.Mapping_practice.repository;

import com.geekster.Mapping_practice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
