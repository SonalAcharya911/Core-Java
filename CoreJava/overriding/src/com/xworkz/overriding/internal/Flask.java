package com.xworkz.overriding.internal;

public class Flask {
    private int capacity;

    private String color;
    public Flask(String color,int capacity){
        this.color=color;
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        System.out.println("capacity: " + capacity);
        System.out.println("color: " + color);
        return "";
    }

    public Flask(){
        System.out.println("no-arg constructor for Flask");
    }
    public void fillFlask() {
        System.out.println("running fillFlask in Flask");
    }
}
