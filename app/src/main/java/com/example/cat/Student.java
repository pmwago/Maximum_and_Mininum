package com.example.cat;


// d) a user defined class with parameters,constructor
public class Student {
    String name,gender;
    int idNo;

    public Student(String name, String gender, int idNo) {
        this.name = name;
        this.gender = gender;
        this.idNo = idNo;
    }

    public int getIdNo() {
        return idNo;
    }

}
