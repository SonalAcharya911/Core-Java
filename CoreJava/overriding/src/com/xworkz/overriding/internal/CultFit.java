package com.xworkz.overriding.internal;

public class CultFit extends Gym{
    public CultFit(){
        System.out.println("no-arg constructor for CultFit");
    }
    public void workout() {
        System.out.println("running workout in CultFit");
    }

    public void train(){
        System.out.println("running train in CultFit");
    }
}
