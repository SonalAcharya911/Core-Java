package com.xworkz.overriding.internal;

public class Rolex extends Watch{
    public Rolex(){
        System.out.println("no-arg constructor for Rolex");
    }
    public void wearRolex() {
        System.out.println("running wearRolex in Rolex");
    }
    public void viewTime(){
        System.out.println(" running viewTime in Rolex");
    }
}
