package com.xworkz.overriding.internal;

public class Tesla extends Scientist{
    public Tesla(){
        System.out.println("no-arg constructor for Tesla");
    }
    public void researchScientist() {
        System.out.println("running researchScientist in Tesla");
    }
    public void invent(){
        System.out.println("running invent in Tesla");
    }
}
