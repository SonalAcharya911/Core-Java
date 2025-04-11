package com.xworkz.overriding.internal;

public class Tiger extends Predator{
    public Tiger(){
        System.out.println("no-arg constructor for Tiger");
    }
    @Override
    public void chase() {
        System.out.println("running chase in Tiger");
    }

    public void roar() {
        System.out.println("running roar in Tiger");
    }
}
