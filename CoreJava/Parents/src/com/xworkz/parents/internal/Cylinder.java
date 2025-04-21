package com.xworkz.parents.internal;

import java.util.Objects;

public class Cylinder {
    private int height;
    private int radius;
    private int capacity;
    private boolean isSealed;

    public Cylinder(int height, int radius, int capacity, boolean isSealed) {
        this.height = height;
        this.radius = radius;
        this.capacity = capacity;
        this.isSealed = isSealed;
    }

    @Override
    public String toString() {
        return "height: " + height + "radius: " + radius + "capacity: " + capacity + "isSealed: " + isSealed;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Cylinder)
        {
            Cylinder cylinder = (Cylinder) obj;
            if(Objects.equals(this.height, cylinder.height)
                    && Objects.equals(this.radius, cylinder.radius)
                    && Objects.equals(this.capacity, cylinder.capacity)
                    && Objects.equals(this.isSealed, cylinder.isSealed))
            {
                System.out.println("cylinder is matching....");
                return true;
            }
        }
        return false;
    }


}
