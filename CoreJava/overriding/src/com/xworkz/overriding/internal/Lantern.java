package com.xworkz.overriding.internal;

public class Lantern extends Lamp{
    public Lantern(){
        System.out.println("no-arg constructor for Lantern");
    }
    public void light() {
        System.out.println("running light in Lamp");
    }
    public void lightLantern() {
        System.out.println("running lightLantern in Lantern");
    }
}
