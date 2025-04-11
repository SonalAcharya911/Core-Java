package com.xworkz.overriding.internal;

public class Park extends Garden{
    public Park(){
        System.out.println("no-arg constructor for Park");
    }
    public void plant() {
        System.out.println("running plant in Park");
    }
    public void walkInPark() {
        System.out.println("running walkInPark in Park");
    }
}
