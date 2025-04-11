package com.xworkz.overriding.internal;

public class Cardiologist extends Doctor {
    public Cardiologist(){
        System.out.println("no-arg constructor for Cardiologist");
    }
    public void diagnose() {
        System.out.println("running diagnose in Cardiologist");
    }

    public void treatPatient() {
        System.out.println("running treatPatient in Cardiologist");
    }
}
