package com.xworkz.overriding.internal;

public class Broker extends Agent{
    public Broker(){
        System.out.println("no-arg constructor for Broker");
    }
    public void deal() {
        System.out.println("running deal in Broker");
    }
    public void call(){
        System.out.println("running call in Broker");
    }
}
