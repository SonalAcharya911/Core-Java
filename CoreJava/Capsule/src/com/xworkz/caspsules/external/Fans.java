package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Mutant;

public class Fans {
    public Fans(){
        System.out.println("no-arg constructor for Fans");
    }

    public void watch(){
        System.out.println("running watch in Fans");
        Mutant mutant=new Mutant();

        System.out.println("Mutant Name: "+mutant.getName());
        System.out.println("Mutant Power: "+mutant.getPower());
        System.out.println("Mutant Age: "+mutant.getAge());
        System.out.println("Mutant Weapon: "+mutant.getWeapon());
        System.out.println("Mutant Weakness: "+mutant.getWeakness());

    }
}
