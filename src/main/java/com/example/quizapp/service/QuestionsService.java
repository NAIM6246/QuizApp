package com.example.quizapp.service;

import com.example.quizapp.entity.Question;
import com.example.quizapp.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    public List<Question> createQuestions(List<Question> questions) {
        return questionsRepository.saveAll(questions);
    }
}
