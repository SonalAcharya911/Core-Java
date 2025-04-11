package com.xworkz.overriding.internal;

public class Teacher extends Guide{
    public Teacher(){
        System.out.println("no-arg constructor for Teacher");
    }
    public void guide() {
        System.out.println("running guide in Teacher");
    }
    public void teach(){
        System.out.println("running teach in Teacher");
    }
}
