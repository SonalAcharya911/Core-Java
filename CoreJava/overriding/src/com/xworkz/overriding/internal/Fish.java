package com.xworkz.overriding.internal;

public class Fish {
    private String species;

    private boolean alive;

    public Fish(String species,boolean alive){
        this.species=species;
        this.alive=alive;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("alive: " + alive);
        return "";
    }

    public Fish(){
        System.out.println("no-arg constructor for Fish");
    }
    public void swim() {
        System.out.println("running swim in Fish");
    }
}
