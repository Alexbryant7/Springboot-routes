package com.example.demo.model;

public class Student {
    private String name;
    private int age;
    private String email;
    private String dir;
    private int cel;


    public Student(){}

    public Student(String name, int age, String email,String dir,int cel) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.dir = dir;
        this.cel =cel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getDir() {
        return dir;
    }

    public int getCel() {
        return cel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }
}