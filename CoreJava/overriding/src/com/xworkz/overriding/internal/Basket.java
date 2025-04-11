package com.xworkz.overriding.internal;

public class Basket extends Carrier{
    public Basket(){
        System.out.println("no-arg constructor for Basket");
    }
    public void carry() {
        System.out.println("running carry in Basket");
    }
    public void hold(){
        System.out.println("running hold in Basket");
    }

}
