package com.example.quizapp.controller;

import com.example.quizapp.entity.Question;
import com.example.quizapp.entity.QuizDto;
import com.example.quizapp.entity.QuizSubmitResponse;
import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/add")
    public QuizDto createQuiz(@RequestBody QuizDto quizDto) {
        return quizService.createQuiz(quizDto);
    }

    @GetMapping("/{id}")
    public  QuizDto getQuizById(@PathVariable int id) {
        return quizService.getQuizById(id);
    }

    @PostMapping("/submit")
    public int submitQuiz(@RequestBody QuizSubmitResponse quizSubmitResponse) {
        return quizService.submitQuiz(quizSubmitResponse);
    }

    @DeleteMapping("/{id}")
    public String deleteQuiz(@PathVariable int id){
        return  quizService.deleteQuiz(id);
    }
}
