package com.xworkz.overriding.internal;

public class Card {
    private long number;
    private String holderName;
    public Card(String holderName,long number){
        this.holderName=holderName;
        this.number=number;
    }

    @Override
    public String toString() {
        System.out.println(this.holderName);
        System.out.println(this.number);
        return "";
    }

    public Card(){
        System.out.println("no-arg constructor for Card");
    }
    public void swipe() {
        System.out.println("running swipe in Card");
    }
}
