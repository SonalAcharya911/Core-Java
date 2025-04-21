package com.xworkz.parents.internal;

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

}
