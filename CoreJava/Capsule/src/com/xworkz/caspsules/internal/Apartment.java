package com.xworkz.caspsules.internal;

public class Apartment {
    private String name="Roma Patria";
    private String location="Brookefield";
    private int noOfFloors=5;
    private int noOfRooms=2;
    private double price=30000.00;


    public Apartment(){
        System.out.println("no-arg constructor for Apartment");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public String getLocation() {
        return location;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
