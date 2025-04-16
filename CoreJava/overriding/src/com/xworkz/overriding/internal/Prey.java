package com.xworkz.overriding.internal;

public class Prey {
    private String species;
    private double speed;

    public void setSpecies(String species){
        this.species = species;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("speed: " + speed);
        return "";
    }

    public Prey(){
        System.out.println("no-arg constructor for Prey");
    }

    public void avoidPredator() {
        System.out.println("running avoidPredator in Prey");
    }
}
