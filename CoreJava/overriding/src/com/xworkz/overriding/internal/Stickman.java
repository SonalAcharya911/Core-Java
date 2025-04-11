package com.xworkz.overriding.internal;

public class Stickman extends Drawing{
    public Stickman(){
        System.out.println("no-arg constructor for Stickman");
    }
    public void makeDrawing() {
        System.out.println("running makeDrawing in Stickman");
    }
    public void drawStickman() {
        System.out.println("running drawStickman in Stickman");
    }
}
