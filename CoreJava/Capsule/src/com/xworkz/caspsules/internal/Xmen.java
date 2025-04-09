package com.xworkz.caspsules.internal;

public class Xmen {
    public Xmen(){
        System.out.println("no-arg constructor for Xmen");
    }

    public void save(){

        System.out.println("running save in Xmen");
        Mutant mutant=new Mutant();

        System.out.println("Mutant Name: "+mutant.getName());
        System.out.println("Mutant Power: "+mutant.getPower());
        System.out.println("Mutant Age: "+mutant.getAge());
        System.out.println("Mutant Weapon: "+mutant.getWeapon());
        System.out.println("Mutant Weakness: "+mutant.getWeakness());

        mutant.setName("Deadpool");
        mutant.setAge(40);
        mutant.setPower("Regeneration");
        mutant.setWeapon("Swords");
        mutant.setWeakness("none");

        System.out.println("updated Mutant Name: "+mutant.getName());
        System.out.println("updated Mutant Power: "+mutant.getPower());
        System.out.println("updated Mutant Age: "+mutant.getAge());
        System.out.println("updated Mutant Weapon: "+mutant.getWeapon());
        System.out.println("updated Mutant Weakness: "+mutant.getWeakness());
    }
}
