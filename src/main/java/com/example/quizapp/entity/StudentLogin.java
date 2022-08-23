package com.example.quizapp.entity;

public class StudentLogin {

    private String email,pass;

    public StudentLogin(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public StudentLogin() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
