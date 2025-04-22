package com.xworkz.parents.internal;

import java.util.Objects;

public class KeyHolder {
    private String material;
    private int keyCount;
    private boolean isWallMounted;
    private String color;

    public KeyHolder(String material, int keyCount, boolean isWallMounted, String color) {
        this.material = material;
        this.keyCount = keyCount;
        this.isWallMounted = isWallMounted;
        this.color = color;
    }

    @Override
    public String toString() {
        return "material: " + material + "keyCount: " + keyCount + "isWallMounted: " + isWallMounted + "color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof KeyHolder)
        {
            KeyHolder keyHolder = (KeyHolder) obj;
            if(Objects.equals(this.material, keyHolder.material) && Objects.equals(this.keyCount, keyHolder.keyCount) && Objects.equals(this.isWallMounted, keyHolder.isWallMounted) && Objects.equals(this.color, keyHolder.color))
            {
                System.out.println("keyHolder is matching....");
                return true;
            }
        }
        return false;
    }

}
