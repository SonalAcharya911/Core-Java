package com.xworkz.overriding.internal;

public class Drawing {
    private String name;
    private boolean pencilSketch;

    public Drawing(String name,boolean pencilSketch){
        this.name=name;
        this.pencilSketch=pencilSketch;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("pencilSketch: " + pencilSketch);
        return "";
    }

    public Drawing(){
        System.out.println("no-arg constructor for Drawing");
    }
    public void makeDrawing() {
        System.out.println("running makeDrawing in Drawing");
    }
}
