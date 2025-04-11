package com.xworkz.overriding.internal;

public class Helmet extends Protector{
    public Helmet(){
        System.out.println("no-arg constructor for Helmet");
    }
    public void helmet() {
        System.out.println("running helmet in Helmet");
    }
    public void wearProtector() {
        System.out.println("running wearProtector in Helmet");
    }
}
