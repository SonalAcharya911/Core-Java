package com.xworkz.overriding.internal;

public class FlipFlop extends Footwear{
    public FlipFlop(){
        System.out.println("no-arg constructor for FlipFlop");
    }
    public void wearFlipFlop() {
        System.out.println("running wearFlipFlop in FlipFlop");
    }
    public void wearFootwear() {
        System.out.println("running wearFootwear in FlipFlop");
    }

}
