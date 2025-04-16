package com.xworkz.overriding.internal;

public class Mammal {
    private String species;
    private double lifespan;

    public Mammal(String species, double lifespan){
        this.species = species;
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("lifespan: " + lifespan);
        return "";
    }

    public Mammal(){
        System.out.println("no-arg constructor for Mammal");
    }
    public void identifyMammal() {
        System.out.println("running identifyMammal in Mammal");
    }
}
