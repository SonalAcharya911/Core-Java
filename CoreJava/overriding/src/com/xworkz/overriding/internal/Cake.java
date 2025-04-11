package com.xworkz.overriding.internal;

public class Cake extends Dessert{
    public Cake(){
        System.out.println("no-arg constructor for Cake");
    }
    public void bake() {
        System.out.println("running bake in Cake");
    }
    public void enjoy() {
        System.out.println("running enjoy in Cake");
    }


}
