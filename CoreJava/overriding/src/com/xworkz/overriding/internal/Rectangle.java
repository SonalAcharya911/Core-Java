package com.xworkz.overriding.internal;

public class Rectangle extends Shape {
    public Rectangle(){
        System.out.println("no-arg constructor for Rectangle");
    }
    public void drawRectangle() {
        System.out.println("running drawRectangle in Rectangle");
    }
    public void drawShape() {
        System.out.println("running drawShape in Shape");
    }
}
