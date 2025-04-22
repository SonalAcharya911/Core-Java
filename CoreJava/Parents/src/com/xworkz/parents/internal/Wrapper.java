package com.xworkz.parents.internal;

import java.util.Objects;

public class Wrapper {
    private String color;
    private String material;
    private int length;
    private boolean isRecyclable;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setRecyclable(boolean recyclable) {
        isRecyclable = recyclable;
    }

    @Override
    public String toString() {
        return "color: " + color + "material: " + material + "length: " + length + "isRecyclable: " + isRecyclable;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Wrapper)
        {
            Wrapper wrapper = (Wrapper) obj;
            if(Objects.equals(this.color, wrapper.color)
                    && Objects.equals(this.material, wrapper.material)
                    && Objects.equals(this.length, wrapper.length)
                    && Objects.equals(this.isRecyclable, wrapper.isRecyclable))
            {
                System.out.println("wrapper is matching....");
                return true;
            }
        }
        return false;
    }


}
