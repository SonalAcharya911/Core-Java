package com.xworkz.overriding.internal;

public class Paint {
    private String color;
    private double quantity;

    public void setColor(String color){
        this.color = color;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        System.out.println("color: " + color);
        System.out.println("quantity: " + quantity);
        return "";
    }

    public Paint(){
        System.out.println("no-arg constructor for Paint");
    }


    public void applyPaint() {
        System.out.println("running applyPaint in Paint");
    }
}
