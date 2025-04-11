package com.xworkz.overriding.internal;

public class Everest extends Mountain{
    public Everest(){
        System.out.println("no-arg constructor for Everest");
    }
    public void climbEverest() {
        System.out.println("running climbEverest in Everest");
    }


    public void climbMountain() {
        System.out.println("running climbMountain in Everest");
    }
}
