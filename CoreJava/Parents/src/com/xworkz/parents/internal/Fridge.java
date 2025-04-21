package com.xworkz.parents.internal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fridge) {
            Fridge fridge = (Fridge) obj;
            if (Objects.equals(this.brand, fridge.brand) &&
                    Objects.equals(this.capacity, fridge.capacity) &&
                    Objects.equals(this.hasFreezer, fridge.hasFreezer) &&
                    Objects.equals(this.powerConsumption, fridge.powerConsumption)) {
                System.out.println("Fridge is matching....");
                return true;
            }
        }
        return false;
    }

}
