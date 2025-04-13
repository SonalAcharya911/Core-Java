package com.xworkz.overriding.internal;

public class Capsicum extends Vegetable{
    public Capsicum(){
        System.out.println("no-arg constructor for Capsicum");
    }
    public void cook() {
        System.out.println("running cook in Capsicum");
    }
    public void grate(){
        System.out.println("running grate in Capsicum");
    }
}
