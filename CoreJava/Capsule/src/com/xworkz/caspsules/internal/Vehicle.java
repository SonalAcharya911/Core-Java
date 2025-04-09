package com.xworkz.caspsules.internal;

public class Vehicle {
    public Vehicle(){
        System.out.println("no-arg constructor for Vehicle");
    }

    public void park(){

        System.out.println("running park in Vehicle");
        Garage garage = new Garage();

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Garage Location: " + garage.getLocation());
        System.out.println("Garage ParkingSlot: " + garage.getParkingSlot());
        System.out.println("Garage isAutomated: " + garage.getIsAutomated());
        System.out.println("Garage MonthlyRent: " + garage.getRent());

        garage.setName("EasyPark");
        garage.setLocation("BTM Layout");
        garage.setParkingSlot(15);
        garage.setIsAutomated(true);
        garage.setRent(6000.00);

        System.out.println("updated Garage Name: " + garage.getName());
        System.out.println("updated Garage Location: " + garage.getLocation());
        System.out.println("updated Garage ParkingSlot: " + garage.getParkingSlot());
        System.out.println("updated Garage isAutomated: " + garage.getIsAutomated());
        System.out.println("updated Garage MonthlyRent: " + garage.getRent());
    }
}

