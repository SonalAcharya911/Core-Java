package com.xworkz.parents.internal;

import java.util.Objects;

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
        if (obj != null && obj instanceof Basket) {
            Basket basket = (Basket) obj;
            if (Objects.equals(this.capacity,basket.capacity ) && Objects.equals(this.color, basket.color) && Objects.equals(this.price, basket.price) && Objects.equals(this.material, basket.material)) {
                System.out.println("baskets are matching");
                return true;
            }
        }
        return false;
    }
}
