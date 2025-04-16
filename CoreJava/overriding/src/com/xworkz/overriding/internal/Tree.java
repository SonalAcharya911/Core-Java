package com.xworkz.overriding.internal;

public class Tree {
    private String species;
    private double height;

    public void setSpecies(String species){
        this.species = species;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public String toString() {
        System.out.println("species: " + species);
        System.out.println("height: " + height);
        return "";
    }

    public Tree(){
        System.out.println("no-arg constructor for Tree");
    }
    public void growTree() {
        System.out.println("running growTree in Tree");
    }
}
