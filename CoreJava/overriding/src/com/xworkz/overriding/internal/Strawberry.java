package com.xworkz.overriding.internal;

public class Strawberry extends Berry{
    public Strawberry(){
        System.out.println("no-arg constructor for Strawberry");
    }
    public void taste() {
        System.out.println("running taste in Strawberry");
    }
    public void eatStrawberry() {
        System.out.println("running eatStrawberry in Strawberry");
    }
}
