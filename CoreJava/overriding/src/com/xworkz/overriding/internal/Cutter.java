package com.xworkz.overriding.internal;

public class Cutter {
    private String bladeType;

    private double length;

    public Cutter(String bladeType,double length){
        this.length=length;
        this.bladeType=bladeType;
    }

    @Override
    public String toString() {
        System.out.println("bladeType: " + bladeType);
        System.out.println("length: " + length);
        return "";
    }

    public Cutter(){
        System.out.println("no-arg constructor for Cutter");
    }
    public void slice() {
        System.out.println("running slice in Cutter");
    }

}
