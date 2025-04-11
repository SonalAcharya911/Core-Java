package com.xworkz.overriding.internal;

public class Parrot extends Bird{
    public Parrot(){
        System.out.println("no-arg constructor for parrot");
    }
    public void fly() {
        System.out.println("running fly in Parrot");
    }
    public void feedParrot() {
        System.out.println("running feedParrot in Parrot");
    }
}
