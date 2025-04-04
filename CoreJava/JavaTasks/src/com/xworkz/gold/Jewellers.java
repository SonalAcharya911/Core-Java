package com.xworkz.gold;

public class Jewellers {
    Gold gold;
    public Jewellers(Gold gold){
        this.gold=gold;
        System.out.println("parameterized constructor for Jewellers");
    }
    public void sell() {
        System.out.println("sell running in JewelleryShop");

        if (gold != null) {
            gold.carat();
        }
        else {
            System.out.println("Gold is null");
        }
    }
}