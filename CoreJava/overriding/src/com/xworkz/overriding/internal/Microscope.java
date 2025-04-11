package com.xworkz.overriding.internal;

public class Microscope extends Device{
    public Microscope(){
        System.out.println("no-arg constructor for Microscope");
    }
    public void useDevice() {
        System.out.println("running useDevice in Device");
    }
    public void useMicroscope() {
        System.out.println("running useMicroscope in Microscope");
    }
}

