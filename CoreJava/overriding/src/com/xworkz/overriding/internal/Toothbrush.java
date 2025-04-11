package com.xworkz.overriding.internal;

public class Toothbrush extends Brush{
    public Toothbrush(){
        System.out.println("no-arg constructor for Toothbrush");
    }
    public void clean() {
        System.out.println("running clean in Toothbrush");
    }
    public void brush() {
        System.out.println("running brush in Toothbrush");
    }
}
