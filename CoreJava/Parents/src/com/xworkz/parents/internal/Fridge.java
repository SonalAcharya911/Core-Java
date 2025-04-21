package com.xworkz.parents.internal;

public class Fridge {
    private String brand;
    private int capacity;
    private boolean hasFreezer;
    private int powerConsumption;

    public Fridge(String brand, int capacity, boolean hasFreezer, int powerConsumption) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "capacity: " + capacity + "hasFreezer: " + hasFreezer + "powerConsumption: " + powerConsumption;
    }
}
