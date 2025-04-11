package com.xworkz.overriding.internal;

public class Cricket extends Sport{
    public Cricket(){
        System.out.println("no-arg constructor for Cricket");
    }

    public void play() {
        System.out.println("running play in Cricket");
    }
    public void playSport() {
        System.out.println("running playSport in Cricket");
    }
}
