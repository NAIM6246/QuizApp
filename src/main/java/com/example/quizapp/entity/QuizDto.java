package com.example.quizapp.entity;

import java.util.List;

public class QuizDto {
    private int id;
    private String name;
    private int courseId;
    private List<Question> questions;

    public QuizDto() {
    }

    public QuizDto(int id, String name, int courseId, List<Question> questions) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
        this.questions = questions;
    }

    public QuizDto(String name, int courseId, List<Question> questions) {
        this.name = name;
        this.courseId = courseId;
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "QuizCreateDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseId=" + courseId +
                ", qn=" + questions +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
