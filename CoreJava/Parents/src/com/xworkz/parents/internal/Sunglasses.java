package com.xworkz.parents.internal;

import java.util.Objects;

public class Sunglasses {
    private String brand;
    private String frameColor;
    private boolean isPolarized;
    private String lensColor;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    public void setLensColor(String lensColor) {
        this.lensColor = lensColor;
    }

    public void setPolarized(boolean polarized) {
        isPolarized = polarized;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "frameColor: " + frameColor + "isPolarized: " + isPolarized + "lensColor: " + lensColor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Sunglasses)
        {
            Sunglasses sunglasses = (Sunglasses) obj;
            if(Objects.equals(this.brand, sunglasses.brand)
                    && Objects.equals(this.frameColor, sunglasses.frameColor)
                    && Objects.equals(this.isPolarized, sunglasses.isPolarized)
                    && Objects.equals(this.lensColor, sunglasses.lensColor))
            {
                System.out.println("sunglasses is matching....");
                return true;
            }
        }
        return false;
    }

}
