package com.xworkz.overriding.internal;

public class StarryNight extends Painting{
    public StarryNight(){
        System.out.println("no-arg constructor for StarryNight");
    }
    public void makePainting() {
        System.out.println("running makePainting in Painting");
    }
    public void paintStarryNight() {
        System.out.println("running paintStarryNight in StarryNight");
    }
}
