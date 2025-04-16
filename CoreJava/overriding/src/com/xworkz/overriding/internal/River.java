package com.xworkz.overriding.internal;

public class River {
    private String name;
    private double length;

    public void setName(String name){
        this.name = name;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("length: " + length);
        return "";
    }

    public River(){
        System.out.println("no-arg constructor for River");
    }
    public void flow() {
        System.out.println("running flow in River");
    }
}
