package com.example.quizapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Teacher {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;
    private  String name,email,pass;
    private  int age;

    public Teacher() {
    }

    public Teacher(int id, String name, String email, String pass, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.age = age;
    }

    public Teacher(String name, String email, String pass, int age) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
