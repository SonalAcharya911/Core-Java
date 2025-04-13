package com.xworkz.overriding.internal;

public class Plate extends Utensil{
    public Plate(){
        System.out.println("no-arg constructor for Plate");
    }
    public void servePlate() {
        System.out.println("running servePlate in Plate");
    }

    public void wash(){
        System.out.println("running wash in Utensil");
    }
}
