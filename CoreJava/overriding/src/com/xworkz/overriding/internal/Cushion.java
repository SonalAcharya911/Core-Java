package com.xworkz.overriding.internal;

public class Cushion {
    private String color;

    private String fillingMaterial;

    public Cushion(String color,String fillingMaterial){
        this.color=color;
        this.fillingMaterial=fillingMaterial;
    }

    @Override
    public String toString() {
        System.out.println("color: " + color);
        System.out.println("fillingMaterial: " + fillingMaterial);
        return "";
    }

    public Cushion(){
        System.out.println("no-arg constructor for Cushion");
    }
    public void comfort() {
        System.out.println("running comfort in Cushion");
    }
}
