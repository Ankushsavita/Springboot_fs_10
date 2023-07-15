package com.geekster.Mapping_practice.service;

import com.geekster.Mapping_practice.model.Book;
import com.geekster.Mapping_practice.model.Course;
import com.geekster.Mapping_practice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public String updateCourseById(Long courseId, Course newCourse) {
        Optional<Course> myCourseOpt = courseRepo.findById(courseId);

        Course myCourse = null;

        if(myCourseOpt.isPresent()){
            myCourse = myCourseOpt.get();
        }else{
            return "id not found";
        }

        myCourse.setCourseId(newCourse.getCourseId());
        myCourse.setCourseDuration(newCourse.getCourseDuration());
        myCourse.setCourseDescription(newCourse.getCourseDescription());
        myCourse.setCourseTitle(newCourse.getCourseTitle());

        courseRepo.save(myCourse);
        return "book updated";
    }

    public String removeCourseById(Long courseId) {
        courseRepo.deleteById(courseId);
        return "course deleted successfully with id : " + courseId;
    }
}
