package com.xworkz.overriding.internal;

public class Villa extends House{
    public Villa(){
        System.out.println("no-arg constructor for Villa");
    }
    public void build() {
        System.out.println("running build in Villa");
    }
    public void live(){
        System.out.println("running live in Villa");
    }
}
