package com.xworkz.overriding.internal;

public class Wizard {
    private String name;
    private String specialty;

    public void setName(String name){
        this.name = name;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("specialty: " + specialty);
        return "";
    }

    public Wizard(){
        System.out.println("no-arg constructor for Wizard");
    }


    public void performMagic(){
        System.out.println("running performMagic in Wizard");
    }
}
