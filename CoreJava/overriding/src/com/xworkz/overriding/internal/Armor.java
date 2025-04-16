package com.xworkz.overriding.internal;

public class Armor {
    private String material;
    private String color;

    public Armor(String material,String color){
        this.material=material;
        this.color=color;
    }

    @Override
    public String toString() {
        System.out.println("material: "+material+" color: "+color);
        return "";
    }

    public Armor(){
        System.out.println("no-arg constructor for Armor");
    }
    public void protect() {
        System.out.println("running protect in Armor");
    }
}
