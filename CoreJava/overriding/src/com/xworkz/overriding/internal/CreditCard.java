package com.xworkz.overriding.internal;

public class CreditCard extends Card{
    public CreditCard(){
        System.out.println("no-arg constructor for CreditCard");
    }
    public void swipe() {
        System.out.println("running swipe in CreditCard");
    }

}
