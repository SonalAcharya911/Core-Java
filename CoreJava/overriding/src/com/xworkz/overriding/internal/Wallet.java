package com.xworkz.overriding.internal;

public class Wallet extends Purse{
    public Wallet(){
        System.out.println("no-arg constructor for Wallet");
    }
    public void carryPurse() {
        System.out.println("running carryPurse in Wallet");
    }

    public void keepMoney(){
        System.out.println("running keepMoney in Wallet");
    }
}
