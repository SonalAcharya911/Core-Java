package com.xworkz.overriding.internal;

public class Herbivore {

    private String species;
    private String habitat;

    public Herbivore(String species, String habitat){
        this.species = species;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("habitat: " + habitat);
        return "";
    }

    public Herbivore(){
        System.out.println("no-arg constructor for Herbivore");
    }
    public void eat() {
        System.out.println("running eatHerbivore in Herbivore");
    }
}
