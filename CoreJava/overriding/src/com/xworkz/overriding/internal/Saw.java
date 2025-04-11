package com.xworkz.overriding.internal;

public class Saw extends Cutter{
    public Saw(){
        System.out.println("no-arg constructor for Saw");
    }
    public void slice() {
        System.out.println("running slice in Saw");
    }
    public void cutSaw() {
        System.out.println("running cutSaw in Saw");
    }

}
