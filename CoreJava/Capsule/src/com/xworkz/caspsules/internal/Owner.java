package com.xworkz.caspsules.internal;

public class Owner {
    public void owns(){
        System.out.println("running owns in Owner");

        Apartment apartment=new Apartment();

        System.out.println("Apartment location: "+apartment.getLocation());
        System.out.println("Apartment Name: "+ apartment.getName());
        System.out.println("Apartment No of floors: "+apartment.getNoOfFloors());
        System.out.println("Apartment price: "+apartment.getPrice());
        System.out.println("Apartment no of rooms: "+apartment.getNoOfRooms());

        apartment.setLocation("Kaggadaspura");
        apartment.setName("Swapna Residency");
        apartment.setNoOfFloors(10);
        apartment.setNoOfRooms(3);
        apartment.setPrice(40000.00);

        System.out.println("updated Apartment location: "+apartment.getLocation());
        System.out.println("updated Apartment Name: "+ apartment.getName());
        System.out.println("updated Apartment No of floors: "+apartment.getNoOfFloors());
        System.out.println("updated Apartment price: "+apartment.getPrice());
        System.out.println("updated Apartment no of rooms: "+apartment.getNoOfRooms());



    }
}
