package com.xworkz.overriding.internal;

public class Toy {
    private String category;
    private double price;

    public void setCategory(String category){
        this.category = category;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println("category: " + category);
        System.out.println("price: " + price);
        return "";
    }

    public Toy(){
        System.out.println("no-arg constructor for Toy");
    }
    public void playToy() {
        System.out.println("running playToy in Toy");
    }
}
