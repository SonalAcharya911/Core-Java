package com.xworkz.overriding.internal;

public class Snake {
    private String species;
    private double length;

    public void setSpecies(String species){
        this.species = species;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("length: " + length);
        return "";
    }

    public Snake(){
        System.out.println("no-arg constructor for Snake");
    }
    public void slitherSnake() {
        System.out.println("running slitherSnake in Snake");
    }
}
