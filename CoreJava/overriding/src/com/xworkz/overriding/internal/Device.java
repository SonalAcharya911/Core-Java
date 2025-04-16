package com.xworkz.overriding.internal;

public class Device {
    private String model;

    private String brand;
    public Device(String model,String brand){
        this.brand=brand;
        this.model=model;
    }

    @Override
    public String toString() {
        System.out.println("model: " + model);
        System.out.println("brand: " + brand);
        return "";
    }

    public Device(){
        System.out.println("no-arg constructor for Device");
    }
    public void useDevice() {
        System.out.println("running useDevice in Device");
    }
}
