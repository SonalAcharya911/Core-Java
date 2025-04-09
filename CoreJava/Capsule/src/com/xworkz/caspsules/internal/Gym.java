package com.xworkz.caspsules.internal;

public class Gym {
    private String name = "CultFit";
    private String location = "Marathahalli";
    private int machines = 15;
    private boolean trainer = true;
    private double fee = 2500.00;

    public Gym() {
        System.out.println("no-arg constructor for Gym");
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getMachines() {
        return machines;
    }

    public boolean getTrainer() {
        return trainer;
    }

    public double getFee() {
        return fee;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setMachines(int machines) {
        this.machines = machines;
    }

    void setTrainer(boolean trainer) {
        this.trainer = trainer;
    }

    void setFee(double fee) {
        this.fee = fee;
    }
}

