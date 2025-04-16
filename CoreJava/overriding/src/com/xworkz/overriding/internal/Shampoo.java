package com.xworkz.overriding.internal;

public class Shampoo {
    private String brand;
    private double quantity;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        System.out.println("brand: " + brand);
        System.out.println("quantity: " + quantity);
        return "";
    }

    public Shampoo(){
        System.out.println("no-arg constructor for Shampoo");
    }
    public void useShampoo() {
        System.out.println("running useShampoo in Shampoo");
    }
}
