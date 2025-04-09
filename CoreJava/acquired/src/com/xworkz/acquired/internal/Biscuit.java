package com.xworkz.acquired.internal;

public class Biscuit extends Snack {
    public Biscuit(){
        System.out.println("no-arg constructor for Biscuit");
    }

    public void eat(){
        System.out.println("running eat in Biscuit");
        Food food=new Food();
        Food food1=new Snack();
        Snack snack=new Snack();
    }
}
