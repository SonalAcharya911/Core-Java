package com.xworkz.parents.internal;

import java.util.Objects;

public class Luggage {
    private int weight;
    private String color;
    private boolean hasWheels;
    private String brand;

    public Luggage(int weight,String color, boolean hasWheels, String brand){
        this.weight=weight;
        this.color=color;
        this.hasWheels=hasWheels;
        this.brand=brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Luggage) {
            Luggage luggage = (Luggage) obj;
            if (Objects.equals(this.weight, luggage.weight) &&
                    Objects.equals(this.color, luggage.color) &&
                    Objects.equals(this.hasWheels, luggage.hasWheels) &&
                    Objects.equals(this.brand, luggage.brand)) {
                System.out.println("Luggage is matching....");
                return true;
            }
        }
        return false;
    }


}
