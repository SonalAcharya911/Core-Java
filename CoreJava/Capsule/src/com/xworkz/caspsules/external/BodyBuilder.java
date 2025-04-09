package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Gym;

public class BodyBuilder {
    public void workout(){
        System.out.println("running workout in BodyBuilder");
        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Gym Location: " + gym.getLocation());
        System.out.println("Gym Machines: " + gym.getMachines());
        System.out.println("Gym Trainer: " + gym.getTrainer());
        System.out.println("Gym Fee: " + gym.getFee());
    }
}
