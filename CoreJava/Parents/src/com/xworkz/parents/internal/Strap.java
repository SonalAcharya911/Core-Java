package com.xworkz.parents.internal;

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

}
