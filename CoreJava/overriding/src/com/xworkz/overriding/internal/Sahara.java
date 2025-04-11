package com.xworkz.overriding.internal;

public class Sahara extends Desert{
    public Sahara(){
        System.out.println("no-arg constructor for Sahara");
    }

    public void heat() {
        System.out.println("running heat in Desert");
    }
    public void exploreSahara() {
        System.out.println("running exploreSahara in Sahara");
    }
}
