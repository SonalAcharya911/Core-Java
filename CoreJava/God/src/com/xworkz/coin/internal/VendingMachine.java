package com.xworkz.coin.internal;

public class VendingMachine {
    public VendingMachine(){
        System.out.println("no-arg constructor for VendingMachine");
    }

    public void take(){
        System.out.println("running take in VendingMachine");
        Coin coin=new Coin();
        coin.flip();
        System.out.println("==============================================");
        coin.insert();

    }
}
