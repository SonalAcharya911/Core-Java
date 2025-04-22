package com.xworkz.parents.internal;

import java.util.Objects;

public class Straw {
    private String color;
    private boolean isReusable;
    private String material;
    private int length;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }

    @Override
    public String toString() {
        return "color: " + color + "isReusable: " + isReusable + "material: " + material + "length: " + length;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Straw)
        {
            Straw straw = (Straw) obj;
            if(Objects.equals(this.color, straw.color)
                    && Objects.equals(this.isReusable, straw.isReusable)
                    && Objects.equals(this.material, straw.material)
                    && Objects.equals(this.length, straw.length))
            {
                System.out.println("straw is matching....");
                return true;
            }
        }
        return false;
    }


}
