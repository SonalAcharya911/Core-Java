package com.xworkz.overriding.internal;

public class Generator extends Backup{
    public Generator(){
        System.out.println("no-arg constructor for Generator");
    }
    public void store() {
        System.out.println("running store in Generator");
    }
}
