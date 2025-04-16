package com.xworkz.overriding.internal;

public class Gym {
    private String name;

    private int machines;

    public Gym(String name,int machines){
        this.name=name;
        this.machines=machines;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("machines: " + machines);
        return "";
    }

    public Gym(){
        System.out.println("no-arg constructor for Gym");
    }
    public void workout() {
        System.out.println("running workout in Gym");
    }
}
