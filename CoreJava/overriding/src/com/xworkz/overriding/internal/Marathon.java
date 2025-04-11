package com.xworkz.overriding.internal;

public class Marathon extends Race{
    public Marathon(){
        System.out.println("no-arg constructor for Marathon");
    }
    public void runMarathon() {
        System.out.println("running runMarathon in Marathon");
    }
    public void compete(){
        System.out.println("running compete in Marathon");
    }
}
