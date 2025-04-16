package com.xworkz.overriding.internal;

public class Spaceship {
    private String model;
    private double speed;

    public void setModel(String model){
        this.model = model;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        System.out.println("model: " + model);
        System.out.println("speed: " + speed);
        return "";
    }

    public Spaceship(){
        System.out.println("no-arg constructor for Spaceship");
    }
    public void flySpaceship() {
        System.out.println("running flySpaceship in Spaceship");
    }
}
