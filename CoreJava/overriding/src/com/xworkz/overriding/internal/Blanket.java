package com.xworkz.overriding.internal;

public class Blanket {
    private String size;
    private String fabric;
    public Blanket(String size,String fabric){
        this.fabric=fabric;
        this.size=size;
    }

    @Override
    public String toString() {
        System.out.println(fabric);
        System.out.println(size);
        return "";
    }
    public Blanket(){
        System.out.println("no-arg constructor for Blanket");
    }
    public void cover() {
        System.out.println("running cover in Blanket");
    }
}
