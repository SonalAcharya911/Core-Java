package com.xworkz.card.internal;

public class Card {
    public Card(){
        System.out.println("no-arg constructor for Card");
    }

    public void shuffle(){
        System.out.println("running shuffle in Card");
        credit();
    }

    void credit(){
        System.out.println("running credit in Card");
        debit();
    }

    private void debit(){
        System.out.println("running debit in Card");
    }
}
