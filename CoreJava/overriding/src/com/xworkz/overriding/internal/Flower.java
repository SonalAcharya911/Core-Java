package com.xworkz.overriding.internal;

public class Flower {
    private String name;

    private String scent;

    public Flower(String name,String scent){
        this.name=name;
        this.scent=scent;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("scent: " + scent);
        return "";
    }

    public Flower(){
        System.out.println("no-arg constructor for Flower");
    }
    public void bloomFlower() {
        System.out.println("running bloomFlower in Flower");
    }
}
