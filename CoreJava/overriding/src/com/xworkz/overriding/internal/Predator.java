package com.xworkz.overriding.internal;

public class Predator {

    private String species;
    private String huntingGround;

    public void setSpecies(String species){
        this.species = species;
    }

    public void setHuntingGround(String huntingGround){
        this.huntingGround = huntingGround;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("huntingGround: " + huntingGround);
        return "";
    }

    public Predator(){
        System.out.println("no-arg constructor for Predator");
    }
    public void chase() {
        System.out.println("running chase in Predator");
    }
}
