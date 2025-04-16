package com.xworkz.overriding.internal;

public class Watch {
    private String brand;
    private String type;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println("brand: " + brand);
        System.out.println("type: " + type);
        return "";
    }

    public Watch(){
        System.out.println("no-arg constructor for Watch");
    }

    public void viewTime(){
        System.out.println(" running viewTime in Watch");
    }
}
