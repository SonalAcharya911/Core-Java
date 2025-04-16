package com.xworkz.overriding.internal;

public class Footwear {
    private String type;

    private String brand;

    public Footwear(String type,String brand){
        this.type=type;
        this.brand=brand;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("brand: " + brand);
        return "";
    }

    public Footwear(){
        System.out.println("no-arg constructor for Footwear");
    }
    public void wearFootwear() {
        System.out.println("running wearFootwear in Footwear");
    }
}
