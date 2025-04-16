package com.xworkz.overriding.internal;

public class OutdoorGame {
    private String name;
    private int duration;

    public void setName(String name){
        this.name = name;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("duration: " + duration);
        return "";
    }

    public OutdoorGame(){
        System.out.println("no-arg constructor for OutdoorGame");
    }
    public void enjoyOutdoorGame() {
        System.out.println("running enjoyOutdoorGame in OutdoorGame");
    }
}
