package com.xworkz.tickets;

public class Ticket {
    int price;
    String dest;
    String src;

    public Ticket(int price,String dest,String src){
        this.price=price;
        this.dest=dest;
        this.src=src;

    }

    public void display(){
        System.out.println("price: "+price+" dest: "+dest+" src: "+src);
    }
}
