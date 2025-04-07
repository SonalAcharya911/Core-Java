package com.xworkz.drone.external;

import com.xworkz.drone.internal.Drone;

public class Student {
    public Student(){
        System.out.println("no-arg constructor in Student ");
    }

    public void flies(){
        System.out.println("running flies in Police");
        Drone drone=new Drone();
        drone.camera();
    }
}
