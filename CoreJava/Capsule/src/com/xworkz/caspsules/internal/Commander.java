package com.xworkz.caspsules.internal;

public class Commander {
    public Commander(){
        System.out.println("no-arg constructor for Commander");
    }

    public void operate(){

        System.out.println("running operate in Commander");
        Tank tank = new Tank();

        System.out.println("Tank Name: " + tank.getName());
        System.out.println("Tank Type: " + tank.getType());
        System.out.println("Tank Crew: " + tank.getCrew());
        System.out.println("Tank Weight: " + tank.getWeight());
        System.out.println("Tank Active: " + tank.getActive());

        tank.setName("SteelStorm");
        tank.setType("Heavy");
        tank.setCrew(3);
        tank.setWeight(62.8);
        tank.setActive(false);

        System.out.println("updated Tank Name: " + tank.getName());
        System.out.println("updated Tank Type: " + tank.getType());
        System.out.println("updated Tank Crew: " + tank.getCrew());
        System.out.println("updated Tank Weight: " + tank.getWeight());
        System.out.println("updated Tank Active: " + tank.getActive());
    }
}
