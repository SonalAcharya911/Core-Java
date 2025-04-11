package com.xworkz.overriding.internal;

public class DoctorStrange extends Wizard{
    public DoctorStrange(){
        System.out.println("no-arg constructor for Actor");
    }

    public void castSpell() {
        System.out.println("running castSpell in DoctorStrange");
    }
}
