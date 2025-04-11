package com.xworkz.overriding.internal;

public class Highway extends Road{
    public Highway(){
        System.out.println("no-arg constructor for Highway");
    }
    public void drive() {
        System.out.println("running drive in Highway");
    }
    public void travelRoad() {
        System.out.println("running travelRoad in Highway");
    }
}
