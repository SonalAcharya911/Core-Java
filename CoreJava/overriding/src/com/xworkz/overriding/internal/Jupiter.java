package com.xworkz.overriding.internal;

public class Jupiter extends Planet{
    public Jupiter(){
        System.out.println("no-arg constructor for Jupiter");
    }
    public void observe() {
        System.out.println("running observe in Jupiter");
    }
    public void rotatePlanet() {
        System.out.println("running rotatePlanet in Jupiter");
    }
}
