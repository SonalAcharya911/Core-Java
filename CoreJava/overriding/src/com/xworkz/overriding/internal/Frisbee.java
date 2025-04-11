package com.xworkz.overriding.internal;

public class Frisbee extends Toy{
    public Frisbee(){
        System.out.println("no-arg constructor for Actor");
    }
    public void throwFrisbee() {
        System.out.println("running throwFrisbee in Frisbee");
    }
    public void playToy() {
        System.out.println("running playToy in Frisbee");
    }
}
