package com.example.quizapp.controller;

import com.example.quizapp.entity.Course;
import com.example.quizapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int id){
        return courseService.deleteCourse(id);
    }
}
