package com.xworkz.parents.internal;

public class Basket {
    private String color;
    private String material;
    private int capacity;
    private int price;

    public Basket(String color, String material, int capacity, int price){
        this.capacity=capacity;
        this.color=color;
        this.material=material;
        this.price=price;
    }

    @Override
    public String toString() {
        return "color: " + color + "material: " + material + "capacity: " + capacity + "price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
