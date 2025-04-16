package com.xworkz.overriding.internal;

public class Mentor {
    private String name;
    private int experience;

    public Mentor(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("experience: " + experience);
        return "";
    }

    public Mentor(){
        System.out.println("no-arg constructor for Mentor");
    }


    public void guideMentor() {
        System.out.println("running guideMentor in Mentor");
    }

}
