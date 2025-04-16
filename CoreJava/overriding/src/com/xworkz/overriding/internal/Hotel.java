package com.xworkz.overriding.internal;

public class Hotel {
    private String name;
    private int rooms;

    public Hotel(String name, int rooms){
        this.name = name;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("rooms: " + rooms);
        return "";
    }

    public Hotel(){
        System.out.println("no-arg constructor for Hotel");
    }
    public void book() {
        System.out.println("running book in Hotel");
    }
}
