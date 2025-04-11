package com.xworkz.overriding.internal;

public class Pony extends HairStyle{
    public Pony(){
        System.out.println("no-arg constructor for Pony");
    }
    public void style() {
        System.out.println("running style in Pony");
    }
    public void tiePony() {
        System.out.println("running tiePony in Pony");
    }
}
