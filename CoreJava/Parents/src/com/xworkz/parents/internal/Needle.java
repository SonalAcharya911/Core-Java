package com.xworkz.parents.internal;

public class Needle {
    private int length;
    private int thickness;
    private String material;
    private boolean isSharp;

    public void setLength(int length) {
        this.length = length;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSharp(boolean sharp) {
        isSharp = sharp;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
}
