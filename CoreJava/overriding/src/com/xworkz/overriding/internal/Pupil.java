package com.xworkz.overriding.internal;

public class Pupil extends Student{
    public Pupil(){
        System.out.println("no-arg constructor for Pupil");
    }
    public void dilatePupil() {
        System.out.println("running dilatePupil in Pupil");
    }
    public void studyStudent() {
        System.out.println("running studyStudent in Pupil");
    }
}
