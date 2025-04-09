package com.xworkz.caspsules.internal;

public class Garage {
    private String name = "AutoNest";
    private String location = "Whitefield";
    private int parkingSlot = 10;
    private boolean isAutomated = false;
    private double Rent = 5000.00;

    public Garage() {
        System.out.println("no-arg constructor for Garage");
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getParkingSlot() {
        return parkingSlot;
    }

    public boolean getIsAutomated() {
        return isAutomated;
    }

    public double getRent() {
        return Rent;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setParkingSlot(int parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    void setIsAutomated(boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    void setRent(double Rent) {
        this.Rent = Rent;
    }
}

