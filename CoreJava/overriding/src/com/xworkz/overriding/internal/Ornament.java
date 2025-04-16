package com.xworkz.overriding.internal;

public class Ornament {
    private String material;
    private double price;

    public void setMaterial(String material){
        this.material = material;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println("material: " + material);
        System.out.println("price: " + price);
        return "";
    }

    public Ornament(){
        System.out.println("no-arg constructor for Ornament");
    }
    public void wearOrnament() {
        System.out.println("running wearOrnament in Ornament");
    }
}
