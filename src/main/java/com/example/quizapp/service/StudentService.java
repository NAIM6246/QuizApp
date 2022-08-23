package com.example.quizapp.service;

import com.example.quizapp.entity.Student;
import com.example.quizapp.entity.StudentLogin;
import com.example.quizapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public  Student login(StudentLogin studentLogin) {
        Student student = studentRepository.findByEmail(studentLogin.getEmail());

        if(student!= null && student.getPass() == studentLogin.getPass()) {
            return  student;
        }
        return  null;
    }

    public Student getStudentByID(int id) {
        Student st = studentRepository.findById(id).orElse(null);
        return  st;
    }

    public List<Student> getAllStudents(){
        return  studentRepository.findAll();
    }
}
