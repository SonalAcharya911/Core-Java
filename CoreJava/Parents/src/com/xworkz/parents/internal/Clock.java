package com.xworkz.parents.internal;

import java.util.Objects;

public class Clock {
    private String type;
    private String brand;
    private boolean isDigital;
    private int diameter;

    public Clock(String type, String brand, boolean isDigital, int diameter) {
        this.type = type;
        this.brand = brand;
        this.isDigital = isDigital;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "type: " + type + "brand: " + brand + "isDigital: " + isDigital + "diameter: " + diameter;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Clock)
        {
            Clock clock = (Clock) obj;
            if(Objects.equals(this.type, clock.type) && Objects.equals(this.brand, clock.brand) && Objects.equals(this.isDigital, clock.isDigital) && Objects.equals(this.diameter, clock.diameter))
            {
                System.out.println("clock is matching....");
                return true;
            }
        }
        return false;
    }


}
