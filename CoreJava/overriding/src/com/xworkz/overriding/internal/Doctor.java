package com.xworkz.overriding.internal;

public class Doctor {
    private String specialization;

    private int experience;

    public Doctor(String specialization,int experience){
        this.experience=experience;
        this.specialization=specialization;
    }

    @Override
    public String toString() {
        System.out.println("specialization: " + specialization);
        System.out.println("experience: " + experience);
        return "";
    }

    public Doctor(){
        System.out.println("no-arg constructor for Doctor");
    }

    public void treatPatient() {
        System.out.println("running treatPatient in Doctor");
    }
}
