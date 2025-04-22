package com.xworkz.parents.internal;

import java.util.Objects;

public class Racquet {
    private String brand;
    private int weight;
    private String gripType;
    private boolean isStringed;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGripType(String gripType) {
        this.gripType = gripType;
    }
    public void setStringed(boolean stringed) {
        isStringed = stringed;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "weight: " + weight + "gripType: " + gripType + "isStringed: " + isStringed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Racquet) {
            Racquet racquet = (Racquet) obj;
            if (Objects.equals(this.brand, racquet.brand) &&
                    Objects.equals(this.weight, racquet.weight) &&
                    Objects.equals(this.gripType, racquet.gripType) &&
                    Objects.equals(this.isStringed, racquet.isStringed)) {
                System.out.println("Racquet is matching....");
                return true;
            }
        }
        return false;
    }

}
