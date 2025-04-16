package com.xworkz.overriding.internal;

public class Road {
    private String type;
    private double length;

    public void setType(String type){
        this.type = type;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("length: " + length);
        return "";
    }

    public Road(){
        System.out.println("no-arg constructor for Road");
    }
    public void travelRoad() {
        System.out.println("running travelRoad in Road");
    }
}
