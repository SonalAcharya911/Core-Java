package com.xworkz.overriding.internal;

public class Shakespeare extends Author{
    public Shakespeare(){
        System.out.println("no-arg constructor for Shakespeare");
    }
    public void write() {
        System.out.println("running write in Shakespeare");
    }
    public void recite(){
        System.out.println("running recite in Shakespeare");
    }
}
