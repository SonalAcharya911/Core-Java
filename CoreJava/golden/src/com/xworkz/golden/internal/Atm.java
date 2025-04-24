package com.xworkz.golden.internal;

public interface Atm {
    void drawMoney();

    static void insertCard(){
        System.out.println("running insertCard in Atm");
    }
}
