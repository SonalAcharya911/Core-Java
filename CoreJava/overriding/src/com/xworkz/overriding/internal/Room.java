package com.xworkz.overriding.internal;

public class Room {
    private String type;
    private double area;

    public void setType(String type){
        this.type = type;
    }

    public void setArea(double area){
        this.area = area;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("area: " + area);
        return "";
    }

    public Room(){
        System.out.println("no-arg constructor for Room");
    }
    public void cleanRoom() {
        System.out.println("running cleanRoom in Room");
    }
}
