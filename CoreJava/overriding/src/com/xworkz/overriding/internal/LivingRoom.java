package com.xworkz.overriding.internal;

public class LivingRoom extends Room{
    public LivingRoom(){
        System.out.println("no-arg constructor for LivingRoom");
    }
    public void cleanLivingRoom() {
        System.out.println("running cleanLivingRoom in LivingRoom");
    }
    public void cleanRoom() {
        System.out.println("running cleanRoom in LivingRoom");
    }
}
