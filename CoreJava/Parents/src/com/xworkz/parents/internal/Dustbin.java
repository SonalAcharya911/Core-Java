package com.xworkz.parents.internal;

public class Dustbin {
    private int capacity;
    private String color;
    private String shape;
    private boolean hasLid;

    public Dustbin(int capacity, String color, String shape, boolean hasLid) {
        this.capacity = capacity;
        this.color = color;
        this.shape = shape;
        this.hasLid = hasLid;
    }

    @Override
    public String toString() {
        return "capacity: " + capacity + "color: " + color + "shape: " + shape + "hasLid: " + hasLid;
    }
}
