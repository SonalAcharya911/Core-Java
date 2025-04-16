package com.xworkz.overriding.internal;

public class OutputDevice {
    private String type;
    private String brand;

    public void setType(String type){
        this.type = type;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("brand: " + brand);
        return "";
    }

    public OutputDevice(){
        System.out.println("no-arg constructor for OutputDevice");
    }
    public void useOutputDevice() {
        System.out.println("running useOutputDevice in OutputDevice");
    }
}
