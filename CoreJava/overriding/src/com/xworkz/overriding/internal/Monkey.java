package com.xworkz.overriding.internal;

public class Monkey extends Mammal{
    public Monkey(){
        System.out.println("no-arg constructor for Monkey");
    }
    public void identifyMammal() {
        System.out.println("running identifyMammal in monkey");
    }
    public void swingMonkey() {
        System.out.println("running swingMonkey in Monkey");
    }
}
