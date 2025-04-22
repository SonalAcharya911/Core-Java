package com.xworkz.parents.abstractClasses;

public class Street extends AbstractRoad {
    public Street(){
        System.out.println("no-arg const of Street");
    }

    public void displayName(){
        System.out.println("running displayName in Street");
    }
}
