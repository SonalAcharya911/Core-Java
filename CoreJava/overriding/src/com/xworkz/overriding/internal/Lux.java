package com.xworkz.overriding.internal;

public class Lux extends BodyWash{
    public Lux (){
        System.out.println("no-arg constructor for Lux ");
    }

    public void cleanse() {
        System.out.println("running cleanse in Lux");
    }
    public void useLux() {
        System.out.println("running useLux in Lux");
    }


}
