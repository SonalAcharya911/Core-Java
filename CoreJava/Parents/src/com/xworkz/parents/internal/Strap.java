package com.xworkz.parents.internal;

import java.util.Objects;

public class Strap {
    private String material;
    private int length;
    private String color;
    private boolean isAdjustable;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAdjustable(boolean adjustable) {

        isAdjustable = adjustable;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "material: " + material + "length: " + length + "color: " + color + "isAdjustable: " + isAdjustable;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Strap)
        {
            Strap strap = (Strap) obj;
            if(Objects.equals(this.material, strap.material)
                    && Objects.equals(this.length, strap.length)
                    && Objects.equals(this.color, strap.color)
                    && Objects.equals(this.isAdjustable, strap.isAdjustable))
            {
                System.out.println("strap is matching....");
                return true;
            }
        }
        return false;
    }


}
