package com.xworkz.overriding.internal;

public class Vehicle {
    private String type;
    private double capacity;

    public void setType(String type){
        this.type = type;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("capacity: " + capacity);
        return "";
    }

    public Vehicle(){
        System.out.println("no-arg constructor for Vehicle");
    }

    public void repair(){
        System.out.println("running repair in Vehicle");
    }
}
