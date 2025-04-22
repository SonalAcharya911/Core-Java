package com.xworkz.parents.internal;

import java.util.Objects;

public class Slipper {
    private String size;
    private String material;
    private String color;
    private boolean isWaterproof;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    @Override
    public String toString() {
        return "size: " + size + "material: " + material + "color: " + color + "isWaterproof: " + isWaterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Slipper)
        {
            Slipper slipper = (Slipper) obj;
            if(Objects.equals(this.size, slipper.size) && Objects.equals(this.material, slipper.material)&& Objects.equals(this.color, slipper.color) && Objects.equals(this.isWaterproof, slipper.isWaterproof))
            {
                System.out.println("slipper is matching....");
                return true;
            }
        }
        return false;
    }


}
