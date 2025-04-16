package com.xworkz.overriding.internal;

public class Ride {
    private String type;
    private double speed;

    public void setType(String type){
        this.type = type;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("speed: " + speed);
        return "";
    }

    public Ride(){
        System.out.println("no-arg constructor for Ride");
    }
    public void goRide() {
        System.out.println("running goRide in Ride");
    }
}
