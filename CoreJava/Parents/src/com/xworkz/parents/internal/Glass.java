package com.xworkz.parents.internal;

import java.util.Objects;

public class Glass {
    private int capacity;
    private String material;
    private boolean isTransparent;
    private String shape;


    public Glass(int capacity, String material, boolean isTransparent, String shape) {
        this.capacity = capacity;
        this.material = material;
        this.isTransparent = isTransparent;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "capacity: " + capacity + "material: " + material + "isTransparent: " + isTransparent + "shape: " + shape ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Glass) {
            Glass glass = (Glass) obj;
            if (Objects.equals(this.capacity, glass.capacity) && Objects.equals(this.material, glass.material) && Objects.equals(this.isTransparent, glass.isTransparent) && Objects.equals(this.shape, glass.shape)) {
                System.out.println("Glass is matching....");
                return true;
            }
        }
        return false;
    }


}
