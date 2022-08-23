package com.example.quizapp.entity;

import java.util.List;

public class QuizSubmitResponse {
    private  int id;
    List<Question> questions;

    public QuizSubmitResponse() {
    }

    public QuizSubmitResponse(int id, List<Question> questions) {
        this.id = id;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

//    public void setQuestions(List<Question> questions) {
//        this.questions = questions;
//    }
}
