package com.xworkz.overriding.internal;

public class House {
    private String address;
    private double area;

    public House(String address, double area){
        this.address = address;
        this.area = area;
    }

    @Override
    public String toString() {
        System.out.println("address: " + address);
        System.out.println("area: " + area);
        return "";
    }

    public House(){
        System.out.println("no-arg constructor for House");
    }
    public void build() {
        System.out.println("running build in House");
    }
}
