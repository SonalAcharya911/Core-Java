package com.xworkz.caspsules.internal;

public class Pilot {
    public Pilot(){
        System.out.println("no-arg constructor for Pilot");
    }

    public void fly(){

        System.out.println("running fly in Pilot");
        Jet jet = new Jet();

        System.out.println("Jet Name: " + jet.getName());
        System.out.println("Jet Company: " + jet.getCompany());
        System.out.println("Jet Seats: " + jet.getSeats());
        System.out.println("Jet Speed: " + jet.getSpeed());
        System.out.println("Jet PrivateJet: " + jet.getPrivateJet());

        jet.setName("ThunderWing");
        jet.setCompany("JetX Corp");
        jet.setSeats(100);
        jet.setSpeed(920.45);
        jet.setPrivateJet(false);

        System.out.println("updated Jet Name: " + jet.getName());
        System.out.println("updated Jet Company: " + jet.getCompany());
        System.out.println("updated Jet Seats: " + jet.getSeats());
        System.out.println("updated Jet Speed: " + jet.getSpeed());
        System.out.println("updated Jet PrivateJet: " + jet.getPrivateJet());
    }
}
