package com.xworkz.overriding.internal;

public class HairStyle {
    private String style;

    private double length;
    public HairStyle(String style,double length){
        this.style=style;
        this.length=length;
    }

    @Override
    public String toString() {
        System.out.println("style: " + style);
        System.out.println("length: " + length);
        return "";
    }

    public HairStyle(){
        System.out.println("no-arg constructor for HairStyle");
    }
    public void style() {
        System.out.println("running style in HairStyle");
    }
}
