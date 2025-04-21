package com.xworkz.parents.internal;

import java.util.Objects;

public class Drawer {
    private String material;
    private int numberOfCompartments;
    private String color;
    private boolean hasLock;

    public Drawer(String material, int numberOfCompartments, String color, boolean hasLock) {
        this.material = material;
        this.numberOfCompartments = numberOfCompartments;
        this.color = color;
        this.hasLock = hasLock;
    }

    @Override
    public String toString() {
        return "material: " + material + "numberOfCompartments: " + numberOfCompartments + "color: " + color + "hasLock: " + hasLock;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Drawer)
        {
            Drawer drawer = (Drawer) obj;
            if(Objects.equals(this.material, drawer.material)
                    && Objects.equals(this.numberOfCompartments, drawer.numberOfCompartments)
                    && Objects.equals(this.color, drawer.color)
                    && Objects.equals(this.hasLock, drawer.hasLock))
            {
                System.out.println("drawer is matching....");
                return true;
            }
        }
        return false;
    }

}
