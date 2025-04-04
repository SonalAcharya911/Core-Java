package com.xworkz.tickets;

public class Passenger {
    Ticket[] ticket;
    String name;
    int age;

    public Passenger(String name, int age, Ticket[] ticket){
        this.name=name;
        this.age=age;
        this.ticket=ticket;

    }

    public void displayDetails(){
        System.out.println("name: "+name+" age: "+age);
        for(Ticket tik:ticket){
            tik.display();
        }
    }
}
