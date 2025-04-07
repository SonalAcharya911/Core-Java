package com.xworkz.drone.internal;

public class Police {
    public Police(){
        System.out.println("no-arg constructor in Police");
    }

    public void surveillance(){
        System.out.println("running surveillance in Police");
        Drone drone=new Drone();
        drone.camera();
        drone.carry();
    }
}
