package com.xworkz.overriding.internal;

public class FrenchFry extends Snack {
    public FrenchFry(){
        System.out.println("no-arg constructor for FrenchFry");
    }

    public void eatFrenchFry() {
        System.out.println("running eatFrenchFry in FrenchFry");
    }
    public void eatSnack() {
        System.out.println("running eatSnack in FrenchFry");
    }
}
