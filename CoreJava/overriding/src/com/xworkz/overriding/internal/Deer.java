package com.xworkz.overriding.internal;

public class Deer extends Prey{
    public Deer(){
        System.out.println("no-arg constructor for Deer");
    }
    public void leap() {
        System.out.println("running leap in Deer");
    }
    public void avoidPredator() {
        System.out.println("running avoidPredator in Deer");
    }
}
