package com.xworkz.overriding.internal;

public class Jar extends Container{
    public Jar(){
        System.out.println("no-arg constructor for Jar");
    }

    @Override
    public void hold() {
        System.out.println("running hold in Jar");
    }

    public void openJar(){
        System.out.println("running openJar in Jar");
    }
}
