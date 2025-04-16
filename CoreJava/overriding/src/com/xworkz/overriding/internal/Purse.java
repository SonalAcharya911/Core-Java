package com.xworkz.overriding.internal;

public class Purse {
    private String brand;
    private double capacity;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        System.out.println("brand: " + brand);
        System.out.println("capacity: " + capacity);
        return "";
    }

    public Purse(){
        System.out.println("no-arg constructor for Purse");
    }
    public void carryPurse() {
        System.out.println("running carryPurse in Purse");
    }
}
