package com.example.quizapp.repository;


import com.example.quizapp.entity.Student;
import com.example.quizapp.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT * FROM Student WHERE Email = ?1", nativeQuery = true)
    Student findByEmail(String email);
}
