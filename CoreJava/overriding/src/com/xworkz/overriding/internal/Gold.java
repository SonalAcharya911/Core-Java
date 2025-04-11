package com.xworkz.overriding.internal;

public class Gold extends Metal{
    public Gold(){
        System.out.println("no-arg constructor for Actor");
    }
    public void buy() {
        System.out.println("running buy in Gold");
    }
    public void meltMetal() {
        System.out.println("running meltMetal in Gold");
    }
}
