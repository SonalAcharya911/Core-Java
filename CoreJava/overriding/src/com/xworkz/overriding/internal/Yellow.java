package com.xworkz.overriding.internal;

public class Yellow extends Color{
    public Yellow(){
        System.out.println("no-arg constructor for Yellow");
    }

    public void blend() {
        System.out.println("running blend in Yellow");
    }
    public void shade(){
        System.out.println("running shade in Yellow");
    }
}
