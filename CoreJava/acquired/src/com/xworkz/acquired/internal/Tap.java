package com.xworkz.acquired.internal;

public class Tap extends Academy {
    public Tap(){
        System.out.println("no-arg constructor for Tap");
    }

    public void open(){
        System.out.println("running open in Tap");

        Organization organization=new Organization();
        Organization organization1=new Academy();
        Organization organization2=new Tap();

        Academy academy=new Academy();
        Academy academy1=new Tap();


    }
}
