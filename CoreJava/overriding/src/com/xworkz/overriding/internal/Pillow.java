package com.xworkz.overriding.internal;

public class Pillow extends Cushion{
    public Pillow(){
        System.out.println("no-arg constructor for Actor");
    }
    public void comfort() {
        System.out.println("running comfort in pillow");
    }
    public void usePillow() {
        System.out.println("running usePillow in Pillow");
    }
}
