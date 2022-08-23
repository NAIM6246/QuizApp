package com.example.quizapp.service;

import com.example.quizapp.entity.Student;
import com.example.quizapp.entity.Teacher;
import com.example.quizapp.entity.TeacherLogin;
import com.example.quizapp.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher login(TeacherLogin teacherLogin) {
        Teacher teacher = teacherRepository.findByEmail(teacherLogin.getEmail());
        if(teacher.getPass() == teacherLogin.getPass()){
            return  teacher;
        }
        return  null;
    }

    public Teacher getTeacherByID(int id) {
        Teacher st = teacherRepository.findById(id).orElse(null);
        return  st;
    }

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }
}
