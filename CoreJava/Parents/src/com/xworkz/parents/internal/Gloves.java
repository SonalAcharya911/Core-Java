package com.xworkz.parents.internal;

import java.util.Objects;

public class Gloves {
    private String size;
    private String material;
    private String color;
    private boolean isWaterproof;

    public Gloves(String size, String material, String color, boolean isWaterproof) {
        this.size = size;
        this.material = material;
        this.color = color;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "size: " + size + "material: " + material + "color: " + color + "isWaterproof: " + isWaterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Gloves) {
            Gloves gloves = (Gloves) obj;
            if (Objects.equals(this.size, gloves.size) &&
                    Objects.equals(this.material, gloves.material) &&
                    Objects.equals(this.color, gloves.color) &&
                    Objects.equals(this.isWaterproof, gloves.isWaterproof)) {
                System.out.println("Gloves are matching....");
                return true;
            }
        }
        return false;
    }


}
