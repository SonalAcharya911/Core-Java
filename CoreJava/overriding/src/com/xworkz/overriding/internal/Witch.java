package com.xworkz.overriding.internal;

public class Witch {
    private String name;
    private String power;

    public void setName(String name){
        this.name = name;
    }

    public void setPower(String power){
        this.power = power;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("power: " + power);
        return "";
    }

    public Witch(){
        System.out.println("no-arg constructor for Witch");
    }
    public void mindControl(){
        System.out.println("running mindControl in Witch");
    }
}
