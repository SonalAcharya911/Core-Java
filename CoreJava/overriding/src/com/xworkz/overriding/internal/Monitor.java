package com.xworkz.overriding.internal;

public class Monitor extends OutputDevice{
    public Monitor(){
        System.out.println("no-arg constructor for Monitor");
    }
    public void displayMonitor() {
        System.out.println("running displayMonitor in Monitor");
    }
    public void useOutputDevice() {
        System.out.println("running useOutputDevice in OutputDevice");
    }
}
