package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Garage;

public class Mechanic {
    public void repairs(){
        System.out.println("running repairs in Mechanic");
        Garage garage = new Garage();

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Garage Location: " + garage.getLocation());
        System.out.println("Garage Parking Slots: " + garage.getParkingSlot());
        System.out.println("Garage Automated: " + garage.getIsAutomated());
        System.out.println("Garage Rent: " + garage.getRent());
    }
}
