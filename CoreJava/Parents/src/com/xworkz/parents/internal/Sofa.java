package com.xworkz.parents.internal;

import java.util.Objects;

public class Sofa {
    private String color;
    private String material;
    private int seatCount;
    private boolean hasCushions;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasCushions(boolean hasCushions) {
        this.hasCushions = hasCushions;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "color: " + color + "material: " + material + "seatCount: " + seatCount + "hasCushions: " + hasCushions;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Sofa)
        {
            Sofa sofa = (Sofa) obj;
            if(Objects.equals(this.color, sofa.color)
                    && Objects.equals(this.material, sofa.material)
                    && Objects.equals(this.seatCount, sofa.seatCount)
                    && Objects.equals(this.hasCushions, sofa.hasCushions))
            {
                System.out.println("sofa is matching....");
                return true;
            }
        }
        return false;
    }


}

