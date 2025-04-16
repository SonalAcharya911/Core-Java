package com.xworkz.overriding.internal;

public class Shape {
    private String type;
    private int sides;

    public void setType(String type){
        this.type = type;
    }

    public void setSides(int sides){
        this.sides = sides;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("sides: " + sides);
        return "";
    }

    public Shape(){
        System.out.println("no-arg constructor for Shape");
    }
    public void drawShape() {
        System.out.println("running drawShape in Shape");
    }
}
