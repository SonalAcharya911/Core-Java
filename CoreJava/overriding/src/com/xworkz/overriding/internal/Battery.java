package com.xworkz.overriding.internal;

public class Battery extends PowerSource{
    public Battery(){
        System.out.println("no-arg constructor for Battery");
    }
    public void charge() {
        System.out.println("running charge in Battery");
    }
    public void supplyPowerSource() {
        System.out.println("running supplyPowerSource in Battery");
    }
}
