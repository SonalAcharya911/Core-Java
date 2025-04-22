package com.xworkz.parents.internal;

import java.util.Objects;

public class Ring {
    private String material;
    private int size;
    private String color;
    private boolean hasStone;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasStone(boolean hasStone) {
        this.hasStone = hasStone;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "material: " + material + "size: " + size + "color: " + color + "hasStone: " + hasStone ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ring) {
            Ring ring = (Ring) obj;
            if (Objects.equals(this.material, ring.material) &&
                    Objects.equals(this.size, ring.size) &&
                    Objects.equals(this.color, ring.color) &&
                    Objects.equals(this.hasStone, ring.hasStone)) {
                System.out.println("Ring is matching....");
                return true;
            }
        }
        return false;
    }

}
