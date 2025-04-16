package com.xworkz.overriding.internal;

public class Protector {
    private String material;
    private String usage;

    public void setMaterial(String material){
        this.material = material;
    }

    public void setUsage(String usage){
        this.usage = usage;
    }

    @Override
    public String toString() {
        System.out.println("material: " + material);
        System.out.println("usage: " + usage);
        return "";
    }

    public Protector(){
        System.out.println("no-arg constructor for Protector");
    }
    public void wearProtector() {
        System.out.println("running wearProtector in Protector");
    }
}
