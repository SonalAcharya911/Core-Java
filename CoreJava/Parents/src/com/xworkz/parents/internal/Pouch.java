package com.xworkz.parents.internal;

import java.util.Objects;

public class Pouch {
    private String material;
    private String color;
    private int capacity;
    private boolean hasZip;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasZip(boolean hasZip) {
        this.hasZip = hasZip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pouch) {
            Pouch pouch = (Pouch) obj;
            if (Objects.equals(this.material, pouch.material) &&
                    Objects.equals(this.color, pouch.color) &&
                    Objects.equals(this.capacity, pouch.capacity) &&
                    Objects.equals(this.hasZip, pouch.hasZip)) {
                System.out.println("Pouch is matching....");
                return true;
            }
        }
        return false;
    }



}

