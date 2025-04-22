package com.xworkz.parents.internal;

import java.util.Objects;

public class Hook {
    private String material;
    private int length;
    private int weightCapacity;
    private boolean isWallMounted;

    public Hook(String material, int length, int weightCapacity, boolean isWallMounted) {
        this.material = material;
        this.length = length;
        this.weightCapacity = weightCapacity;
        this.isWallMounted = isWallMounted;
    }

    @Override
    public String toString() {
        return "material: " + material + "length: " + length + "weightCapacity: " + weightCapacity + "isWallMounted: " + isWallMounted;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hook) {
            Hook hook = (Hook) obj;
            if (Objects.equals(this.material, hook.material) && Objects.equals(this.length, hook.length) && Objects.equals(this.weightCapacity, hook.weightCapacity) && Objects.equals(this.isWallMounted, hook.isWallMounted)) {
                System.out.println("Hook is matching....");
                return true;
            }
        }
        return false;
    }

}
