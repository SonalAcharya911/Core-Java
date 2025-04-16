package com.xworkz.overriding.internal;

public class Utensil {
    private String type;
    private String material;

    public void setType(String type){
        this.type = type;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("material: " + material);
        return "";
    }

    public Utensil(){
        System.out.println("no-arg constructor for Utensil");
    }

    public void wash(){
        System.out.println("running wash in Utensil");
    }

}
