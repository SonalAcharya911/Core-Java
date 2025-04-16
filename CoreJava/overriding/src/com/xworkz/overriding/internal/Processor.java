package com.xworkz.overriding.internal;

public class Processor {
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

    public Processor(){
        System.out.println("no-arg constructor for Processor");
    }


    public void useProcessor() {
        System.out.println("running useProcessor in Processor");
    }
}
