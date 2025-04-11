package com.xworkz.overriding.internal;

public class Nile extends River{
    public Nile(){
        System.out.println("no-arg constructor for Nile");
    }
    public void visitNile() {
        System.out.println("running visitNile in Nile");
    }
    public void flow() {
        System.out.println("running flow in Nile");
    }
}
