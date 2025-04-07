package com.xworkz.coin.internal;

public class Coin {
    public Coin() {
        System.out.println("no-arg constructor for  Coin");
    }

    private void toss() {
        System.out.println("running toss in Coin");
    }

    void flip() {
        System.out.println("running flip in Coin");
        toss();
    }

    public void insert() {
        System.out.println("running insert in Coin");
        flip();
    }
}
