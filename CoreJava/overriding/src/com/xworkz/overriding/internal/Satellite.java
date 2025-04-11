package com.xworkz.overriding.internal;

public class Satellite extends Spaceship{
    public Satellite(){
        System.out.println("no-arg constructor for Satellite");
    }
    public void launchSatellite() {
        System.out.println("running launchSatellite in Satellite");
    }
    public void flySpaceship() {
        System.out.println("running flySpaceship in Spaceship");
    }
}
