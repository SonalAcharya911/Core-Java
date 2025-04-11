package com.xworkz.overriding.internal;

public class Doctor {
    public Doctor(){
        System.out.println("no-arg constructor for Doctor");
    }

    public void treatPatient() {
        System.out.println("running treatPatient in Doctor");
    }
}
