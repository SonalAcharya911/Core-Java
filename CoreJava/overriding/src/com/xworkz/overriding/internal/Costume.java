package com.xworkz.overriding.internal;

public class Costume {
    private String design;

    private String fabricType;

    public Costume(String design,String fabricType){
        this.design=design;
        this.fabricType=fabricType;
    }

    @Override
    public String toString() {
        System.out.println("design: " + design);
        System.out.println("fabricType: " + fabricType);
        return "";
    }

    public Costume(){
        System.out.println("no-arg constructor for Costume");
    }
    public void wear() {
        System.out.println("running wear in Costume");
    }

}
