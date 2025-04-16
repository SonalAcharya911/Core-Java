package com.xworkz.overriding.internal;

public class Jewellery {
    private String type;
    private double price;

    public Jewellery(String type, double price){
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("price: " + price);
        return "";
    }

    public Jewellery() {
        System.out.println("no-arg constructor for Jewellery");
    }

    public void wearJewels() {
        System.out.println("running wearJewels in Jewellery");
    }
}