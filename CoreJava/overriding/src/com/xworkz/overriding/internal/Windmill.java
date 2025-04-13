package com.xworkz.overriding.internal;

public class Windmill extends Turbine{
    public Windmill(){
        System.out.println("no-arg constructor for Windmill");
    }

    public void turn(){
        System.out.println("running turn in Turbine");
    }

    public void generateElectricity(){
        System.out.println("running generateElectricity in Windmill");
    }

}
