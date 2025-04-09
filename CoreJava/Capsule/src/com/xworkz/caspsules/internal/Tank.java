package com.xworkz.caspsules.internal;

public class Tank {
    private String name = "IronClad";
    private String type = "Battle";
    private int crew = 4;
    private double weight = 55.5;
    private boolean active = true;

    public Tank() {
        System.out.println("no-arg constructor for Tank");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCrew() {
        return crew;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getActive() {
        return active;
    }

    void setName(String name) {
        this.name = name;
    }

    void setType(String type) {
        this.type = type;
    }

    void setCrew(int crew) {
        this.crew = crew;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void setActive(boolean active) {
        this.active = active;
    }
}
