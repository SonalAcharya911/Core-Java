package com.xworkz.overriding.internal;

public class Pencil {
    private String grade;
    private String length;

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setLength(String length){
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.println("grade: " + grade);
        System.out.println("length: " + length);
        return "";
    }

    public Pencil(){
        System.out.println("no-arg constructor for Pencil");
    }


    public void usePencil() {
        System.out.println("running usePencil in Pencil");
    }
}
