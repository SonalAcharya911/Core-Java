package com.xworkz.overriding.internal;

public class Fabric {
    private double length;

    private String material;

    public Fabric(double length,String material){
        this.length=length;
        this.material=material;
    }

    @Override
    public String toString() {
        System.out.println("length: " + length);
        System.out.println("material: " + material);
        return "";
    }

    public Fabric(){
        System.out.println("no-arg constructor for Fabric");
    }
    public void weaveFabric() {
        System.out.println("running weaveFabric in Fabric");
    }
}
