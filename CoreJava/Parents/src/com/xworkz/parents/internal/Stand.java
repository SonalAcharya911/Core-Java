package com.xworkz.parents.internal;

import java.util.Objects;

public class Stand {
    private String type;
    private String material;
    private int height;
    private boolean isAdjustable;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAdjustable(boolean adjustable) {
        isAdjustable = adjustable;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Stand)
        {
            Stand stand = (Stand) obj;
            if(Objects.equals(this.type, stand.type)
                    && Objects.equals(this.material, stand.material)
                    && Objects.equals(this.height, stand.height)
                    && Objects.equals(this.isAdjustable, stand.isAdjustable))
            {
                System.out.println("stand is matching....");
                return true;
            }
        }
        return false;
    }

}
