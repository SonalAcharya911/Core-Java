package com.xworkz.gold;

public class Jewellers {
    public void sell(Gold gold) {
        System.out.println("sell running in JewelleryShop");

        if (gold != null) {
            gold.carat();
        }
        else {
            System.out.println("Gold is null");
        }
    }
}