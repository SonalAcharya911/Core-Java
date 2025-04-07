package com.xworkz.coin.external;

import com.xworkz.coin.internal.Coin;

public class PhoneBooth {
    public PhoneBooth(){
        System.out.println("no-arg constructor in PhoneBooth");
    }

    public void accepts(){
        System.out.println("running accept in Coin");
        Coin coin=new Coin();
        coin.insert();
    }
}
