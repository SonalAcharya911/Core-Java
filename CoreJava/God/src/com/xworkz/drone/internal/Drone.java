package com.xworkz.drone.internal;

public class Drone {
    public Drone() {
        System.out.println("no-arg constructor in Drone");
    }

    private void security() {
        System.out.println("running security in Drone");
    }

    void carry() {
        System.out.println("running carry in Drone");
        security();
    }

    public void camera() {
        System.out.println("running camera in Drone");
        carry();
    }
}
