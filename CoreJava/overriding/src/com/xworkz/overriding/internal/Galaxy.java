package com.xworkz.overriding.internal;

public class Galaxy {
    private String name;

    private long starCount;
    public Galaxy(String name, long starCount){
        this.name=name;
        this.starCount=starCount;

    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("starCount: " + starCount);
        return "";
    }

    public Galaxy(){
        System.out.println("no-arg constructor for Galaxy");
    }
    public void exploreGalaxy() {
        System.out.println("running exploreGalaxy in Galaxy");
    }
}
