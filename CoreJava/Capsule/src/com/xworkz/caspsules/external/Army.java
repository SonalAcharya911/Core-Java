package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Tank;

public class Army {
    public void deploy(){
        System.out.println("running deploy in Army");
        Tank tank = new Tank();

        System.out.println("Tank Name: " + tank.getName());
        System.out.println("Tank Type: " + tank.getType());
        System.out.println("Tank Crew: " + tank.getCrew());
        System.out.println("Tank Weight: " + tank.getWeight());
        System.out.println("Tank Active: " + tank.getActive());
    }
}
