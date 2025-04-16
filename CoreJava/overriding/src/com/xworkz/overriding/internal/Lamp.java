package com.xworkz.overriding.internal;

public class Lamp {
    private String type;
    private String color;

    public Lamp(String type, String color){
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("color: " + color);
        return "";
    }

    public Lamp(){
        System.out.println("no-arg constructor for Lamp");
    }
    public void light() {
        System.out.println("running light in Lamp");
    }
}
