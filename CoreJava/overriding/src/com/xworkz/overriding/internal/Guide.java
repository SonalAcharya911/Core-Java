package com.xworkz.overriding.internal;

public class Guide {
    private String name;

    private int experience;

    public  Guide(String name,int experience){
        this.name=name;
        this.experience=experience;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("experience: " + experience);
        return "";
    }

    public Guide(){
        System.out.println("no-arg constructor for Guide");
    }
    public void guide() {
        System.out.println("running guide in Guide");
    }
}
