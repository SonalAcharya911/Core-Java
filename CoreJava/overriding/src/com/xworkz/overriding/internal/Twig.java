package com.xworkz.overriding.internal;

public class Twig extends Stick{
    public Twig(){
        System.out.println("no-arg constructor for Twig");
    }
    public void holdStick() {
        System.out.println("running holdStick in Twig");
    }
    public void poke(){
        System.out.println("running poke in Twig");
    }

}
