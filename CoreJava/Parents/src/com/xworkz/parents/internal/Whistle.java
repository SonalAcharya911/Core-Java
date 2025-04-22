package com.xworkz.parents.internal;

import java.util.Objects;

public class Whistle {
    private String material;
    private String color;
    private int size;
    private boolean hasLanyard;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasLanyard(boolean hasLanyard) {
        this.hasLanyard = hasLanyard;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "material: " + material + "color: " + color + "size: " + size + "hasLanyard: " + hasLanyard;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Whistle)
        {
            Whistle whistle = (Whistle) obj;
            if(Objects.equals(this.material, whistle.material)
                    && Objects.equals(this.color, whistle.color)
                    && Objects.equals(this.size, whistle.size)
                    && Objects.equals(this.hasLanyard, whistle.hasLanyard))
            {
                System.out.println("whistle is matching....");
                return true;
            }
        }
        return false;
    }

}
