package com.xworkz.overriding.internal;

public class Net extends Trap{
    public Net(){
        System.out.println("no-arg constructor for Net");
    }
    public void catchNet() {
        System.out.println("running catchNet in Net");
    }
    public void setTrap() {
        System.out.println("running setTrap in Net");
    }

}
