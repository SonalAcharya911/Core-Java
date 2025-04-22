package com.xworkz.parents.internal;

import java.util.Objects;

public class Soap {
    private String fragrance;
    private int weight;
    private String color;
    private boolean isAntibacterial;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAntibacterial(boolean antibacterial) {
        isAntibacterial = antibacterial;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "fragrance: " + fragrance + "weight: " + weight + "color: " + color + "isAntibacterial: " + isAntibacterial;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Soap)
        {
            Soap soap = (Soap) obj;
            if(Objects.equals(this.fragrance, soap.fragrance)
                    && Objects.equals(this.weight, soap.weight)
                    && Objects.equals(this.color, soap.color)
                    && Objects.equals(this.isAntibacterial, soap.isAntibacterial))
            {
                System.out.println("soap is matching....");
                return true;
            }
        }
        return false;
    }


}
