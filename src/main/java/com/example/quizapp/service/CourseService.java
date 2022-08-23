package com.example.quizapp.service;

import com.example.quizapp.entity.Course;
import com.example.quizapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return  courseRepository.save(course);
    }
    public Course getCourseById(int id){
        return courseRepository.findById(id).orElse(null);
    }

    public String deleteCourse(int id){
        courseRepository.deleteById(id);
        return "course deleted";
    }
}
