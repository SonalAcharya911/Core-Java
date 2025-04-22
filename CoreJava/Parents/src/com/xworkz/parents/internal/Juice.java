package com.xworkz.parents.internal;

import java.util.Objects;

public class Juice {
    private String flavor;
    private int quantity;
    private boolean isChilled;
    private String brand;

    public Juice(String flavor, int quantity, boolean isChilled, String brand) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.isChilled = isChilled;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "flavor: " + flavor + "quantity: " + quantity + "isChilled: " + isChilled + "brand: " + brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Juice) {
            Juice juice = (Juice) obj;
            if (Objects.equals(this.flavor, juice.flavor) && Objects.equals(this.quantity, juice.quantity) && Objects.equals(this.isChilled, juice.isChilled) && Objects.equals(this.brand, juice.brand)) {
                System.out.println("Juice is matching....");
                return true;
            }
        }
        return false;
    }

}
