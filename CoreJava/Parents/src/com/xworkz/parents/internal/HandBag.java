package com.xworkz.parents.internal;

import java.util.Objects;

public class HandBag {
    private String brand;
    private String color;
    private int capacity;
    private boolean hasZip;

    public HandBag(String brand, String color, int capacity, boolean hasZip) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.hasZip = hasZip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof HandBag) {
            HandBag handBag = (HandBag) obj;
            if (Objects.equals(this.brand, handBag.brand) &&
                    Objects.equals(this.color, handBag.color) &&
                    Objects.equals(this.capacity, handBag.capacity) &&
                    Objects.equals(this.hasZip, handBag.hasZip)) {
                System.out.println("HandBag is matching....");
                return true;
            }
        }
        return false;
    }



}
