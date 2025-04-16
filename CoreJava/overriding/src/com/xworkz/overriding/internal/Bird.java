package com.xworkz.overriding.internal;

public class Bird {
    private String species;
    private int wingSpan;
    public Bird(String species,int wingSpan){
        this.species=species;
        this.wingSpan=wingSpan;
    }
    @Override
    public String toString() {
        System.out.println(species);
        System.out.println(wingSpan);
        return "";
    }
    public Bird(){
        System.out.println("no-arg constructor for Bird");
    }
    public void fly() {
        System.out.println("running fly in Bird");
    }

}
