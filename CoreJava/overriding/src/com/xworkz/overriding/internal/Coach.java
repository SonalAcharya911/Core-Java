package com.xworkz.overriding.internal;

public class Coach extends Mentor{
    public Coach(){
        System.out.println("no-arg constructor for Coach");
    }
    public void train() {
        System.out.println("running train in Coach");
    }
    public void guideMentor() {
        System.out.println("running guideMentor in Mentor");
    }
}
