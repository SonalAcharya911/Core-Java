package com.xworkz.overriding.internal;

public class Necklace extends Jewellery{
    public Necklace(){
        System.out.println("no-arg constructor for Necklace");
    }
    public void wearJewels() {
        System.out.println("running wearJewels in Necklace");
    }
    public void wearNecklace() {
        System.out.println("running wearNecklace in Necklace");
    }
}
