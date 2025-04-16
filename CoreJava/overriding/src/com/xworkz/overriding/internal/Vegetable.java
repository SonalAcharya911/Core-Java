package com.xworkz.overriding.internal;

public class Vegetable {
    private String name;
    private String color;

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        return "";
    }

    public Vegetable() {
        System.out.println("no-arg constructor for Vegetable");
    }

    public void cook() {
        System.out.println("running cook in Vegetable");
    }
}