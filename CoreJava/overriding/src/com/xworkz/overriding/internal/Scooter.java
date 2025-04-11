package com.xworkz.overriding.internal;

public class Scooter extends Ride{
    public Scooter(){
        System.out.println("no-arg constructor for Scooter");
    }
    public void goRide() {
        System.out.println("running goRide in Scooter");
    }
    public void rideScooter() {
        System.out.println("running rideScooter in Scooter");
    }
}
