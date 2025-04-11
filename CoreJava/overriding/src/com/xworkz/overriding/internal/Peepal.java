package com.xworkz.overriding.internal;

public class Peepal extends Tree{
    public Peepal(){
        System.out.println("no-arg constructor for Peepal");
    }
    public void worshipPeepal() {
        System.out.println("running worshipPeepal in Peepal");
    }
    public void growTree() {
        System.out.println("running growTree in Peepal");
    }
}
