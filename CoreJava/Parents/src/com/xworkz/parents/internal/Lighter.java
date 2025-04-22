package com.xworkz.parents.internal;

import java.util.Objects;

public class Lighter {
    private String color;
    private boolean isRefillable;
    private int weight;
    private String brand;

    public Lighter(String color, String brand, boolean isRefillable, int weight) {
        this.color = color;
        this.brand = brand;
        this.isRefillable = isRefillable;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "color: " + color + "isRefillable: " + isRefillable + "weight: " + weight + "brand: " + brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lighter) {
            Lighter lighter = (Lighter) obj;
            if (Objects.equals(this.color, lighter.color) && Objects.equals(this.isRefillable, lighter.isRefillable) && Objects.equals(this.weight, lighter.weight) && Objects.equals(this.brand, lighter.brand)) {
                System.out.println("Lighter is matching....");
                return true;
            }
        }
        return false;
    }

}
