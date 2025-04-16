package com.xworkz.overriding.internal;

public class HairTie {
    private String material;

    private String color;

    public HairTie(String material,String color){
        this.material=material;
        this.color=color;
    }

    @Override
    public String toString() {
        System.out.println("material: " + material);
        System.out.println("color: " + color);
        return "";
    }

    public HairTie(){
        System.out.println("no-arg constructor of HairTie");
    }

    public void tieHair(){
        System.out.println("running tieHair");
    }
}
