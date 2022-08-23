package com.example.quizapp.repository;

import com.example.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends JpaRepository<Question,Integer> {
    @Query(value = "SELECT * FROM Question WHERE QUIZ_ID = ?1", nativeQuery = true)
    List<Question> findByQuizId(int id);

    @Query(value = "Delete FROM Question WHERE QUIZ_ID = ?1", nativeQuery = true)
    void deleteAllByQuizId(int id);
}
