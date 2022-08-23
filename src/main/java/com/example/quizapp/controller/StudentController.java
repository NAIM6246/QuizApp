package com.example.quizapp.controller;


import com.example.quizapp.entity.Student;
import com.example.quizapp.entity.StudentLogin;
import com.example.quizapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {
    @Autowired
    private  StudentService studentService;

    @PostMapping("/register")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PostMapping("/login")
    public  Student login(@RequestBody StudentLogin studentLogin) {
        return  studentService.login(studentLogin);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return  studentService.getStudentByID(id);
    }

    @GetMapping("/")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }
}
