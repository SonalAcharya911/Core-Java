package com.xworkz.overriding.internal;

public class Ring extends Ornament{
    public Ring(){
        System.out.println("no-arg constructor for Ring");
    }
    public void wearOrnament() {
        System.out.println("running wearOrnament in Ring");
    }
    public void wearRing() {
        System.out.println("running wearRing in Ring");
    }
}
