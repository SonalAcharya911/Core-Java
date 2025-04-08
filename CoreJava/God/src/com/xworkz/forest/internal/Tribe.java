package com.xworkz.forest.internal;

public class Tribe {
    public Tribe(){
        System.out.println("no-arg constructor fir Tribe");
    }

    public void livesIn(){
        Forest forest=new Forest();
        forest.afforestation();
        forest.plants();
    }
}
