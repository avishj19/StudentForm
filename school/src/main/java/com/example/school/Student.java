package com.example.school;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String gender;
    float gpa;
    int student_id;
    String email;
    String phone_number;
    String grade;
    String major;

    public Student(String name, String gender, float gpa, int student_id, String email, String phone_number, String grade, String major) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.student_id = student_id;
        this.email = email;
        this.phone_number = phone_number;
        this.grade = grade;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", student_id=" + student_id +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

