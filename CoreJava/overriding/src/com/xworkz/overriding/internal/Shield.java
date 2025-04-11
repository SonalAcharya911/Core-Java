package com.xworkz.overriding.internal;

public class Shield extends Armor{
    public Shield(){
        System.out.println("no-arg constructor for Shield");
    }
    public void protect() {
        System.out.println("running protect in Shield");
    }
    public void holdShield() {
        System.out.println("running holdShield in Shield");
    }
}
