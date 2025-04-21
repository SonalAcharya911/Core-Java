package com.xworkz.parents.internal;

import java.util.Objects;

public class PhotoFrame {
    private String color;
    private String material;
    private int height;
    private int width;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof PhotoFrame) {
            PhotoFrame photoFrame = (PhotoFrame) obj;
            if (Objects.equals(this.color, photoFrame.color) &&
                    Objects.equals(this.material, photoFrame.material) &&
                    Objects.equals(this.height, photoFrame.height) &&
                    Objects.equals(this.width, photoFrame.width)) {
                System.out.println("PhotoFrame is matching....");
                return true;
            }
        }
        return false;
    }

}
