package com.xworkz.overriding.internal;

public class Dove extends Shampoo{
    public Dove(){
        System.out.println("no-arg constructor for Dove");
    }
    public void lather() {
        System.out.println("running lather in Dove");
    }
    public void useShampoo() {
        System.out.println("running useShampoo in Dove");
    }
}
