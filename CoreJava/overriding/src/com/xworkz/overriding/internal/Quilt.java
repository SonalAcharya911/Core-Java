package com.xworkz.overriding.internal;

public class Quilt extends Blanket{
    public Quilt(){
        System.out.println("no-arg constructor for Quilt");
    }
    public void cover() {
        System.out.println("running cover in Quilt");
    }
    public void coverQuilt() {
        System.out.println("running coverQuilt in Quilt");
    }

}
