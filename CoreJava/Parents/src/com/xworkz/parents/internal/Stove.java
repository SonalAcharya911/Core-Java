package com.xworkz.parents.internal;

import java.util.Objects;

public class Stove {
    private String brand;
    private int burnerCount;
    private boolean isElectric;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void setBurnerCount(int burnerCount) {
        this.burnerCount = burnerCount;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "burnerCount: " + burnerCount + "isElectric: " + isElectric + "color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Stove)
        {
            Stove stove = (Stove) obj;
            if(Objects.equals(this.brand, stove.brand) && Objects.equals(this.burnerCount, stove.burnerCount) && Objects.equals(this.isElectric, stove.isElectric) && Objects.equals(this.color, stove.color))
            {
                System.out.println("stove is matching....");
                return true;
            }
        }
        return false;
    }

}
