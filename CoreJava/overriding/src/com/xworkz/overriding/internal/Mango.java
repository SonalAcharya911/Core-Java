package com.xworkz.overriding.internal;

public class Mango extends Fruit{
    public Mango(){
        System.out.println("no-arg constructor for Mango");
    }
    public void eatFruit() {
        System.out.println("running eatFruit in Mango");
    }
    public void eatMango() {
        System.out.println("running eatMango in Mango");
    }
}
