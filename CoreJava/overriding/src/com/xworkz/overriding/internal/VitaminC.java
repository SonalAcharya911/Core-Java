package com.xworkz.overriding.internal;

public class VitaminC extends Serum{
    public VitaminC(){
        System.out.println("no-arg constructor for VitaminC");
    }
    public void applySerum() {
        System.out.println("running applySerum in VitaminC");
    }
}
