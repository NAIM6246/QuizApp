package com.example.quizapp.repository;

import com.example.quizapp.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    @Query(value = "SELECT * FROM Teacher WHERE Email = ?1", nativeQuery = true)
    Teacher findByEmail(String email);
}
