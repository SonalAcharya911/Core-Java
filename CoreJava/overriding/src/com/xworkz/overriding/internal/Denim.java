package com.xworkz.overriding.internal;

public class Denim extends Fabric{
    public Denim(){
        System.out.println("no-arg constructor for Denim");
    }
    public void wear() {
        System.out.println("running wear in Denim");
    }
    public void weaveFabric() {
        System.out.println("running weaveFabric in Denim");
    }


}
