package com.xworkz.overriding.internal;

public class Scrunchie extends HairTie{
    public Scrunchie(){
        System.out.println("no-arg constructor of Scrunchie");
    }

    public void tieHair(){
        System.out.println("running tieHair in Scrunchie");
    }

    public void holdHair(){
        System.out.println("running holdHair in Scrunchie");
    }
}
