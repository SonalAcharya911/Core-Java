package com.xworkz.overriding.external;

public class Inverter extends Generator{
    public Inverter(){
        System.out.println("no-arg constructor of Inverter");
    }

    @Override
    public void generate() {
        System.out.println("running generate in Inverter");;
    }

    public void backup(){
        System.out.println("running backup in Inverter");
    }
}
