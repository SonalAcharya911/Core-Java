package com.xworkz.parents.internal;

import java.util.Objects;

public class Doll {
    private String name;
    private int height;
    private String material;
    private boolean hasDress;

    public Doll(String name, int height, String material, boolean hasDress) {
        this.name = name;
        this.height = height;
        this.material = material;
        this.hasDress = hasDress;
    }

    @Override
    public String toString() {
        return "name: " + name + "height: " + height + "material: " + material + "hasDress: " + hasDress;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Doll)
        {
            Doll doll = (Doll) obj;
            if(Objects.equals(this.name, doll.name) && Objects.equals(this.height, doll.height) && Objects.equals(this.material, doll.material) && Objects.equals(this.hasDress, doll.hasDress))
            {
                System.out.println("doll is matching....");
                return true;
            }
        }
        return false;
    }

}
