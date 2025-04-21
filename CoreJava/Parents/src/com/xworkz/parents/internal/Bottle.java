package com.xworkz.parents.internal;

import java.util.Objects;

public class Bottle {
    private int capacity;
    private String color;
    private boolean isPlastic;
    private boolean hasCap;

    public Bottle(int capacity, String color, boolean isPlastic, boolean hasCap) {
        this.capacity = capacity;
        this.color = color;
        this.isPlastic = isPlastic;
        this.hasCap = hasCap;
    }

    @Override
    public String toString() {
        return "capacity: " + capacity + "color: " + color + "isPlastic: " + isPlastic + "hasCap: " + hasCap ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Bottle)
        {
            Bottle bottle=(Bottle) obj;
            if(Objects.equals(this.color,bottle.color)&& Objects.equals(this.capacity,bottle.capacity)  && Objects.equals(this.isPlastic,bottle.isPlastic) && Objects.equals(this.hasCap,bottle.hasCap))
            {
                System.out.println("bottle is matching....");
                return true;
            }
        }
        return false;
    }
}
