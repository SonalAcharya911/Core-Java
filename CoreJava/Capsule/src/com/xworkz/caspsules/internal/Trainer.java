package com.xworkz.caspsules.internal;

public class Trainer {
    public Trainer(){
        System.out.println("no-arg constructor for Trainer");
    }

    public void train(){

        System.out.println("running train in Trainer");
        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Gym Location: " + gym.getLocation());
        System.out.println("Gym Machines: " + gym.getMachines());
        System.out.println("Gym Trainer: " + gym.getTrainer());
        System.out.println("Gym Fee: " + gym.getFee());

        gym.setName("PowerHouse");
        gym.setLocation("Rajajinagar");
        gym.setMachines(30);
        gym.setTrainer(true);
        gym.setFee(2000.00);

        System.out.println("updated Gym Name: " + gym.getName());
        System.out.println("updated Gym Location: " + gym.getLocation());
        System.out.println("updated Gym Machines: " + gym.getMachines());
        System.out.println("updated Gym Trainer: " + gym.getTrainer());
        System.out.println("updated Gym Fee: " + gym.getFee());
    }
}

