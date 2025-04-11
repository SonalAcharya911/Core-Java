package com.xworkz.overriding.internal;

public class Hoodie extends Outfit{
    public Hoodie(){
        System.out.println("no-arg constructor for Hoodie");
    }
    public void wear() {
        System.out.println("running wear in Hoodie");
    }
    public void tryOutfit() {
        System.out.println("running tryOutfit in Hoodie");
    }
}
