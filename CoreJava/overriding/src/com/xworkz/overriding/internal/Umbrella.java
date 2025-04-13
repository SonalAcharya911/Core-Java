package com.xworkz.overriding.internal;

public class Umbrella extends Cover{
    public Umbrella(){
        System.out.println("no-arg constructor for Umbrella");
    }
    public void shield() {
        System.out.println("running shield in Umbrella");
    }
    public void hold(){
        System.out.println("running hold in Umbrella");
    }
}
