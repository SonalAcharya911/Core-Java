package com.xworkz.parents.internal;

import java.util.Objects;

public class ToothPaste {
    private String brand;
    private String color;
    private int cost;
    private boolean minty;

    public ToothPaste(String brand,String color,int cost,boolean minty){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
        this.minty=minty;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "color: " + color + "cost: " + cost + "minty: " + minty;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ToothPaste) {
            ToothPaste toothPaste = (ToothPaste) obj;
            if (Objects.equals(this.brand, toothPaste.brand) && Objects.equals(this.minty, toothPaste.minty) && Objects.equals(this.cost, toothPaste.cost) && Objects.equals(this.color, toothPaste.color)) {
                System.out.println("toothPaste  is matching");
                return true;
            }
        }

        return false;
    }
}
