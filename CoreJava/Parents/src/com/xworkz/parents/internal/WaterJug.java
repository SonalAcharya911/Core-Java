package com.xworkz.parents.internal;

import java.util.Objects;

public class WaterJug {
    private String material;
    private int capacity;
    private boolean hasLid;
    private boolean isTransparent;

    public WaterJug(String material, int capacity, boolean hasLid, boolean isTransparent){
        this.material=material;
        this.capacity=capacity;
        this.hasLid=hasLid;
        this.isTransparent=isTransparent;
    }

    @Override
    public String toString() {
        return "material: " + material + "capacity: " + capacity + "hasLid: " + hasLid + "isTransparent: " + isTransparent;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof WaterJug){
            WaterJug waterJug=(WaterJug) obj;
            if(Objects.equals(this.capacity,waterJug.capacity)&& Objects.equals(this.hasLid,waterJug.hasLid)&& Objects.equals(this.material,waterJug.material)&& Objects.equals(this.isTransparent,waterJug.isTransparent)){
                System.out.println("jugs are matching");
                return true;
            }
        }
        return false;
    }
}
