package com.xworkz.overriding.internal;

public class Hanger extends Holder{
    public Hanger(){
        System.out.println("no-arg constructor for Hanger");
    }
    public void hang() {
        System.out.println("running hang in Hanger");
    }
    public void hold() {
        System.out.println("running hold in Hanger");
    }
}

