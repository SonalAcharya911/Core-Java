package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Jet;

public class AirForce {
    public void mission(){
        System.out.println("running mission in AirForce");
        Jet jet = new Jet();

        System.out.println("Jet Name: " + jet.getName());
        System.out.println("Jet Company: " + jet.getCompany());
        System.out.println("Jet Seats: " + jet.getSeats());
        System.out.println("Jet Speed: " + jet.getSpeed());
        System.out.println("Jet PrivateJet: " + jet.getPrivateJet());
    }
}
