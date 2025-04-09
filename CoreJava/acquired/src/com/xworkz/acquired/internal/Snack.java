package com.xworkz.acquired.internal;

public class Snack extends Food{
    public Snack(){
        System.out.println("no-arg constructor for Snack");
    }
    public void bake(){
        System.out.println("running bake in Snack");
        Food food=new Food();
    }
}
