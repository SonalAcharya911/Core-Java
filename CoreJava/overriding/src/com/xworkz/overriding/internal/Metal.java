package com.xworkz.overriding.internal;

public class Metal {
    private String type;
    private double density;

    public Metal(String type, double density){
        this.type = type;
        this.density = density;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("density: " + density);
        return "";
    }

    public Metal(){
        System.out.println("no-arg constructor for Metal");
    }
    public void meltMetal() {
        System.out.println("running meltMetal in Metal");
    }
}
