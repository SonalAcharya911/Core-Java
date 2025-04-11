package com.xworkz.overriding.internal;

public class Prey {
    public Prey(){
        System.out.println("no-arg constructor for Prey");
    }

    public void avoidPredator() {
        System.out.println("running avoidPredator in Prey");
    }
}
