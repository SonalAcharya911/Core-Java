package com.xworkz.overriding.internal;

public class Student {

    private String name;
    private int rollNumber;

    public void setName(String name){
        this.name = name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("rollNumber: " + rollNumber);
        return "";
    }

    public Student(){
        System.out.println("no-arg constructor for Student");
    }
    public void studyStudent() {
        System.out.println("running studyStudent in Student");
    }
}
