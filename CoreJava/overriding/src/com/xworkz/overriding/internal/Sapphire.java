package com.xworkz.overriding.internal;

public class Sapphire extends Gemstone{
    public Sapphire(){
        System.out.println("no-arg constructor for Sapphire");
    }
    public void polish() {
        System.out.println("running polish in Sapphire");
    }
    public void shine() {
        System.out.println("running shine in Sapphire");
    }
}
