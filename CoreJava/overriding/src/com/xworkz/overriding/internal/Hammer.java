package com.xworkz.overriding.internal;

public class Hammer extends Tool{
    public Hammer(){
        System.out.println("no-arg constructor for Hammer");
    }
    public void hit() {
        System.out.println("running hit in Hammer");
    }
    public void useTool() {
        System.out.println("running useTool in Hammer");
    }
}
