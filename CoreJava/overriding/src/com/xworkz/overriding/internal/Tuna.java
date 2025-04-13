package com.xworkz.overriding.internal;

public class Tuna extends Fish{
    public Tuna(){
        System.out.println("no-arg constructor for Tuna");
    }
    public void swim() {
        System.out.println("running swim in Tuna");
    }

    public void die(){
        System.out.println("running die in Tuna");
    }

}
