package com.xworkz.parents.internal;

import java.util.Objects;

public class Mixture {
    private String brand;
    private int capacity;
    private boolean isElectric;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "capacity: " + capacity + "isElectric: " + isElectric + "color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mixture) {
            Mixture mixture = (Mixture) obj;
            if (Objects.equals(this.brand, mixture.brand) && Objects.equals(this.capacity, mixture.capacity) && Objects.equals(this.isElectric, mixture.isElectric) && Objects.equals(this.color, mixture.color)) {
                System.out.println("Mixture is matching....");
                return true;
            }
        }
        return false;
    }


}
