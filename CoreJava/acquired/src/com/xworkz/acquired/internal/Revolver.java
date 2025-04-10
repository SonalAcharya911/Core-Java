package com.xworkz.acquired.internal;

public class Revolver extends Weapon{
    public Revolver(){
        System.out.println("no-arg constructor for Revolver");
    }

    public void shoot(){
        System.out.println("running shoot in Revolver");
        Tool tool=new Tool();
        Tool tool1=new Weapon();
        Tool tool2=new Revolver();

        Weapon weapon=new Weapon();
        Weapon weapon1=new Revolver();
    }
}
