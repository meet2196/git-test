package com.example.myapplication;
public class Results {

    @Results("name")
    private String superName;


    public Results(String name) {
        this.superName = name;
    }

    public String getName() {
        return superName;
    }
}