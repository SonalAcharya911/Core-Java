package com.xworkz.acquired.internal;

public class Cactus extends Plant{
    public Cactus(){
        System.out.println("no-arg constructor for Cactus");
    }

    public void prick(){
        System.out.println("running prick in Cactus");
        Thing thing=new Thing();
        Thing thing1=new Plant();
        Thing thing2=new Cactus();

        Plant plant=new Plant();
        Plant plant1=new Cactus();

    }
}
