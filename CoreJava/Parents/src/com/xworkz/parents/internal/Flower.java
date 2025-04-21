package com.xworkz.parents.internal;

public class Flower {
    private String color;
    private String type;
    private int petalCount;
    private boolean hasFragrance;

    public Flower(String color, String type, int petalCount, boolean hasFragrance) {
        this.color = color;
        this.type = type;
        this.petalCount = petalCount;
        this.hasFragrance = hasFragrance;
    }

    @Override
    public String toString() {
        return "color: " + color + "type: " + type + "petalCount: " + petalCount + "hasFragrance: " + hasFragrance;
    }
}
