package com.xworkz.overriding.internal;

public class Cow extends Herbivore{
    public Cow(){
        System.out.println("no-arg constructor for Cow");
    }
    public void moo() {
        System.out.println("running moo in Cow");
    }
    public void eatHerbivore() {
        System.out.println("running eatHerbivore in Cow");
    }
}
