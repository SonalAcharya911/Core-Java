package com.xworkz.overriding.internal;

public class Sport {
    private String name;
    private String type;

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("type: " + type);
        return "";
    }

    public Sport(){
        System.out.println("no-arg constructor for Sport");
    }
    public void playSport() {
        System.out.println("running playSport in Sport");
    }
}
