package com.xworkz.parents.internal;

import java.util.Objects;

public class Dustbin {
    private int capacity;
    private String color;
    private String shape;
    private boolean hasLid;

    public Dustbin(int capacity, String color, String shape, boolean hasLid) {
        this.capacity = capacity;
        this.color = color;
        this.shape = shape;
        this.hasLid = hasLid;
    }

    @Override
    public String toString() {
        return "capacity: " + capacity + "color: " + color + "shape: " + shape + "hasLid: " + hasLid;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Dustbin)
        {
            Dustbin dustbin = (Dustbin) obj;
            if(Objects.equals(this.capacity, dustbin.capacity) && Objects.equals(this.color, dustbin.color) && Objects.equals(this.shape, dustbin.shape) && Objects.equals(this.hasLid, dustbin.hasLid))
            {
                System.out.println("dustbin is matching....");
                return true;
            }
        }
        return false;
    }


}
