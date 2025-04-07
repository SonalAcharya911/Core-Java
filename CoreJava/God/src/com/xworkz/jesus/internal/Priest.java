package com.xworkz.jesus.internal;

public class Priest {
    public Priest(){
        System.out.println("no-arg constructor in Priest");
    }

    public void preach(){
        System.out.println("running preach in Priest");
        Church church=new Church();
        church.prayer();
        church.wedding();
    }
}
