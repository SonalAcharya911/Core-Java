package com.xworkz.overriding.internal;

public class Holder {
    private String type;
    private String shape;

    public Holder(String type, String shape){
        this.type = type;
        this.shape = shape;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("shape: " + shape);
        return "";
    }

    public Holder(){
        System.out.println("no-arg constructor for Holder");
    }
    public void hold() {
        System.out.println("running hold in Holder");
    }
}
