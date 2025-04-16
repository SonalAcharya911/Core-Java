package com.xworkz.overriding.internal;

public class Stick {
    private String material;
    private double length;

    public void setMaterial(String material){
        this.material = material;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.println("material: " + material);
        System.out.println("length: " + length);
        return "";
    }

    public Stick(){
        System.out.println("no-arg constructor for Stick");
    }
    public void holdStick() {
        System.out.println("running holdStick in Stick");
    }
}
