package com.xworkz.overriding.internal;

public class BodyWash {
    private String brand;
    private int volume;
    public BodyWash(String brand,int volume){
        this.brand=brand;
        this.volume=volume;
    }
    @Override
    public String toString() {
        System.out.println(brand);
        System.out.println(volume);
        return "";
    }
    public BodyWash(){
        System.out.println("no-arg constructor for BodyWash");
    }
    public void cleanse() {
        System.out.println("running cleanse in BodyWash");
    }
}
