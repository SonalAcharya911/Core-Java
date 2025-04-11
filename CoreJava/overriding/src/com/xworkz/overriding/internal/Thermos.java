package com.xworkz.overriding.internal;

public class Thermos extends Flask{
    public Thermos(){
        System.out.println("no-arg constructor for Thermos");
    }
    public void fillFlask() {
        System.out.println("running fillFlask in Thermos");
    }

    public void fillThermos() {
        System.out.println("running fillThermos in Thermos");
    }
}
