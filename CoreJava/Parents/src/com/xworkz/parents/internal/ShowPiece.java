package com.xworkz.parents.internal;

import java.util.Objects;

public class ShowPiece {
    private String material;
    private String color;
    private String type;
    private int weight;

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof ShowPiece)
        {
            ShowPiece showPiece = (ShowPiece) obj;
            if(Objects.equals(this.material, showPiece.material)
                    && Objects.equals(this.color, showPiece.color)
                    && Objects.equals(this.type, showPiece.type)
                    && Objects.equals(this.weight, showPiece.weight))
            {
                System.out.println("showPiece is matching....");
                return true;
            }
        }
        return false;
    }


}
