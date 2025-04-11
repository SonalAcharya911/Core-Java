package com.xworkz.overriding.internal;

public class Antivirus extends Software{
    public Antivirus(){
        System.out.println("no-arg constructor for Antivirus");
    }

    public void scan() {
        System.out.println("running scan in Antivirus");
    }
    public void developSoftware() {
        System.out.println("running developSoftware in Antivirus");
    }
}
