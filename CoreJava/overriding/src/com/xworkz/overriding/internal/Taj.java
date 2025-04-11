package com.xworkz.overriding.internal;

public class Taj extends Hotel{
    public Taj(){
        System.out.println("no-arg constructor for Taj");
    }
    public void book() {
        System.out.println("running book in Taj");
    }
    public void visitTaj() {
        System.out.println("running visitTaj in Taj");
    }
}
