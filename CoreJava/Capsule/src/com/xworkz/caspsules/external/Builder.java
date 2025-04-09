package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Apartment;

public class Builder {
    public void builds(){
        System.out.println("running builds in builder");
        Apartment apartment=new Apartment();

        System.out.println("Apartment location: "+apartment.getLocation());
        System.out.println("Apartment Name: "+ apartment.getName());
        System.out.println("Apartment No of floors: "+apartment.getNoOfFloors());
        System.out.println("Apartment price: "+apartment.getPrice());
        System.out.println("Apartment no of rooms: "+apartment.getNoOfRooms());
    }
}
