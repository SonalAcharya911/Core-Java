package com.xworkz.parents.internal;

import java.util.Objects;

public class Mat {
    private String material;
    private int length;
    private int width;
    private String color;

    public Mat(String material, int length, int width, String color) {
        this.material=material;
        this.length=length;
        this.width=width;
        this.color=color;
    }

    @Override
    public String toString() {
        return "material: " + material + "length: " + length + "width: " + width + "color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mat) {
            Mat mat = (Mat) obj;
            if (Objects.equals(this.material, mat.material) && Objects.equals(this.length, mat.length) && Objects.equals(this.width, mat.width) && Objects.equals(this.color, mat.color)) {
                System.out.println("Mat is matching....");
                return true;
            }
        }
        return false;
    }


}
