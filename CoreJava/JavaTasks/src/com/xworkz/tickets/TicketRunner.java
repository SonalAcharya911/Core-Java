package com.xworkz.tickets;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(45, "Mico Layout", "CMRIT");
        Ticket ticket2 = new Ticket(23, "Marathahalli", "HAL");

        Ticket[] ticket = {ticket1, ticket2};

        Passenger passenger = new Passenger("Sonal", 21, ticket);
        passenger.displayDetails();

    }
}
