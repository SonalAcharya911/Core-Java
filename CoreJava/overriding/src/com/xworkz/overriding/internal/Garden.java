package com.xworkz.overriding.internal;

public class Garden {
    private String name;

    private double area;
    public Garden(String name, double area){
        this.name=name;
        this.area=area;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("area: " + area);
        return "";
    }

    public Garden() {
        System.out.println("no-arg constructor for Garden");
    }
    public void plant() {
        System.out.println("running plant in Garden");
    }
}
