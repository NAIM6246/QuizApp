package com.example.quizapp.controller;

import com.example.quizapp.entity.Student;
import com.example.quizapp.entity.Teacher;
import com.example.quizapp.entity.TeacherLogin;
import com.example.quizapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/register")
    public Teacher createTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable int id){
        return teacherService.getTeacherByID(id);
    }

    @GetMapping("/")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @PostMapping("/login")
    public Teacher login(@RequestBody TeacherLogin teacherLogin) {
        return  teacherService.login(teacherLogin);
    }
}
