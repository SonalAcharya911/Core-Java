package com.xworkz.perfume.internal;

public class Lady {
    public Lady(){
        System.out.println("no-arg constructor in Lady ");
    }

    public void spray(){
        System.out.println("running spray in Lady");
        Perfume perfume=new Perfume();
        perfume.deodorant();
        perfume.mist();
    }
}
