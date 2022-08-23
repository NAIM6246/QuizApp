package com.example.quizapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  int id;

    private int quizId;
    private String question,ans;
    private int mark;

    public Question() {
    }

    public Question(int id,int quizId, String question, String ans, int mark) {
        this.id = id;
        this.quizId = quizId;
        this.question = question;
        this.ans = ans;
        this.mark = mark;
    }

    public Question(int quizId,String question, String ans, int mark) {
        this.quizId = quizId;
        this.question = question;
        this.ans = ans;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", quizId=" + quizId +
                ", question='" + question + '\'' +
                ", ans='" + ans + '\'' +
                ", mark=" + mark +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getquestion() {
        return question;
    }

    public void setquestion(String question) {
        this.question = question;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }
}
