package com.xworkz.parents.internal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Needle) {
            Needle needle = (Needle) obj;
            if (Objects.equals(this.length, needle.length) &&
                    Objects.equals(this.thickness, needle.thickness) &&
                    Objects.equals(this.material, needle.material) &&
                    Objects.equals(this.isSharp, needle.isSharp)) {
                System.out.println("Needle is matching....");
                return true;
            }
        }
        return false;
    }

}
