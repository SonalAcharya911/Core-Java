package com.xworkz.overriding.internal;

public class Carrier {
    private String brand;
    private int capacity;
    public Carrier(String brand,int capacity){
        this.brand=brand;
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        System.out.println(this.brand);
        System.out.println(this.capacity);
        return "";
    }

    public Carrier() {
        System.out.println("no-arg constructor of Carrier");
    }
    public void hold(){
        System.out.println("running hold in Carrier");
    }
}
