package com.xworkz.overriding.internal;

public class Gemstone {
    private String type;

    private int carat;
    public Gemstone(String type,int carat){
        this.carat=carat;
        this.type=type;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("carat: " + carat);
        return "";
    }

    public Gemstone(){
        System.out.println("no-arg constructor for Gemstone");
    }
    public void polish() {
        System.out.println("running polish in Gemstone");
    }
}
