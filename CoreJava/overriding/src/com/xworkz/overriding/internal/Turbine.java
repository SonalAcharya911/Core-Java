package com.xworkz.overriding.internal;

public class Turbine {
    private String type;
    private double power;

    public void setType(String type){
        this.type = type;
    }

    public void setPower(double power){
        this.power = power;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("power: " + power);
        return "";
    }

    public Turbine(){
        System.out.println("no-arg constructor for Turbine");
    }

    public void turn(){
        System.out.println("running turn in Turbine");
    }
}
