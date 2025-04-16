package com.xworkz.overriding.internal;

public class Furniture {
    private String type;

    private String material;

    public Furniture(String type,String material){
        this.material=material;
        this.type=type;

    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("material: " + material);
        return "";
    }

    public Furniture(){
        System.out.println("no-arg constructor for Furniture");
    }
    public void useFurniture() {
        System.out.println("running useFurniture in Furniture");
    }
}
