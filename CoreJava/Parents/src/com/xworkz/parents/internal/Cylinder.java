package com.xworkz.parents.internal;

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
}
