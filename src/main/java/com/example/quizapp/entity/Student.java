package com.example.quizapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;

    private String name,email, pass;
    private int age;
    private LocalDate dob;

    public Student() {
    }
    public Student(String name, String email,String pass, int age, LocalDate dob) {

        this.name = name;
        this.email = email;
        this.pass = pass;
        this.age = age;
        this.dob = dob;
    }
    public Student(int id, String name, String email,String pass, int age, LocalDate dob) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
    public long getId()  {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPass(){
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
