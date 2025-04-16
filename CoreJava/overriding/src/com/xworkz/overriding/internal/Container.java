package com.xworkz.overriding.internal;

public class Container {
    private double capacity;

    private String material;


    public Container(){
        System.out.println("no-arg constructor for Container");
    }


    public void hold() {
        System.out.println("running hold in Container");
    }
}
