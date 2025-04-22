package com.xworkz.parents.internal;

import java.util.Objects;

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


    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Flower)
        {
            Flower flower = (Flower) obj;
            if(Objects.equals(this.color, flower.color) && Objects.equals(this.type, flower.type) && Objects.equals(this.petalCount, flower.petalCount) && Objects.equals(this.hasFragrance, flower.hasFragrance))
            {
                System.out.println("flower is matching....");
                return true;
            }
        }
        return false;
    }

}
