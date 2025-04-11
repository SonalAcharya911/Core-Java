package com.xworkz.overriding.internal;

public class Milkyway extends Galaxy{
    public Milkyway(){
        System.out.println("no-arg constructor for Milkyway");
    }
    public void exploreGalaxy() {
        System.out.println("running exploreGalaxy in Milkyway");
    }
    public void observeMilkyway() {
        System.out.println("running observeMilkyway in Milkyway");
    }
}
