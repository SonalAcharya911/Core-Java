package com.xworkz.parents.internal;

import java.util.Objects;

public class Stair {
    private int stepCount;
    private String material;
    private int height;
    private boolean hasRailing;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHasRailing(boolean hasRailing) {
        this.hasRailing = hasRailing;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }

    @Override
    public String toString() {
        return "stepCount: " + stepCount + "material: " + material + "height: " + height + "hasRailing: " + hasRailing;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Stair)
        {
            Stair stair = (Stair) obj;
            if(Objects.equals(this.stepCount, stair.stepCount)
                    && Objects.equals(this.material, stair.material)
                    && Objects.equals(this.height, stair.height)
                    && Objects.equals(this.hasRailing, stair.hasRailing))
            {
                System.out.println("stair is matching....");
                return true;
            }
        }
        return false;
    }

}
