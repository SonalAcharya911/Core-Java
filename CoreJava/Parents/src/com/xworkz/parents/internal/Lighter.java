package com.xworkz.parents.internal;

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
}
