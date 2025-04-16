package com.xworkz.overriding.internal;

public class Mountain {
    private String name;
    private double height;

    public Mountain(String name, double height){
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("height: " + height);
        return "";
    }

    public Mountain(){
        System.out.println("no-arg constructor for Mountain");
    }


    public void climbMountain() {
        System.out.println("running climbMountain in Mountain");
    }
}
