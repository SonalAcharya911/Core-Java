package com.xworkz.overriding.internal;

public class Truck extends Vehicle{
    public Truck(){
        System.out.println("no-arg constructor for Truck");
    }
    public void driveTruck() {
        System.out.println("running driveTruck in Truck");
    }
    public void repair(){
        System.out.println("running repair in Truck");
    }
}
