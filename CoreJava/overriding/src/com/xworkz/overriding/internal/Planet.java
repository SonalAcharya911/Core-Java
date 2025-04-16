package com.xworkz.overriding.internal;

public class Planet{
    private String name;
    private double diameter;

    public void setName(String name){
        this.name = name;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("diameter: " + diameter);
        return "";
    }

    public Planet(){
        System.out.println("no-arg constructor for Planet");
    }
    public void rotatePlanet() {
        System.out.println("running rotatePlanet in Planet");
    }
}
