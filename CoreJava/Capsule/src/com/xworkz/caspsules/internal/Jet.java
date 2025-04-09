package com.xworkz.caspsules.internal;

public class Jet {
    private String name = "SkyArrow";
    private String company = "AeroTech";
    private int seats = 80;
    private double speed = 850.75;
    private boolean privateJet = true;

    public Jet() {
        System.out.println("no-arg constructor for Jet");
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSeats() {
        return seats;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean getPrivateJet() {
        return privateJet;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCompany(String company) {
        this.company = company;
    }

    void setSeats(int seats) {
        this.seats = seats;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    void setPrivateJet(boolean privateJet) {
        this.privateJet = privateJet;
    }
}
