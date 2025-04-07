package com.xworkz.card.internal;

public class ATM {
    public ATM(){
        System.out.println("no-arg constructor for ATM");
    }

    public void swipe(){
        System.out.println("running swipe in ATM");
        Card card=new Card();
        card.credit();
        System.out.println("==================================");
        card.shuffle();
    }

}
