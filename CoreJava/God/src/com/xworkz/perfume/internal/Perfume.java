package com.xworkz.perfume.internal;

public class Perfume {
    public Perfume(){
        System.out.println("no-arg constructor in Perfume ");
    }

    private void rollOn(){
        System.out.println("running rollOn in Perfume");
    }

    void deodorant(){
        System.out.println("running deodorant in Perfume");
    }

    public void mist(){
        System.out.println("running mist in Perfume");
        deodorant();
        rollOn();
    }
}
