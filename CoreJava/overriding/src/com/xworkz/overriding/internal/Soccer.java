package com.xworkz.overriding.internal;

public class Soccer extends OutdoorGame{
    public Soccer(){
        System.out.println("no-arg constructor for Soccer");
    }
    public void enjoyOutdoorGame() {
        System.out.println("running enjoyOutdoorGame in OutdoorGame");
    }
    public void playSoccer() {
        System.out.println("running playSoccer in Soccer");
    }
}
