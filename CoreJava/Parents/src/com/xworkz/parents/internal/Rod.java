package com.xworkz.parents.internal;

import java.util.Objects;

public class Rod {
    private int length;
    private String material;
    private int weight;
    private boolean isHollow;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHollow(boolean hollow) {
        isHollow = hollow;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Rod)
        {
            Rod rod = (Rod) obj;
            if(Objects.equals(this.length, rod.length)
                    && Objects.equals(this.material, rod.material)
                    && Objects.equals(this.weight, rod.weight)
                    && Objects.equals(this.isHollow, rod.isHollow))
            {
                System.out.println("rod is matching....");
                return true;
            }
        }
        return false;
    }


}
