package com.xworkz.overriding.internal;

public class Trap {
    private String purpose;
    private String material;

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    @Override
    public String toString() {
        System.out.println("purpose: " + purpose);
        System.out.println("material: " + material);
        return "";
    }

    public Trap(){
        System.out.println("no-arg constructor for Trap");
    }
    public void setTrap() {
        System.out.println("running setTrap in Trap");
    }
}
