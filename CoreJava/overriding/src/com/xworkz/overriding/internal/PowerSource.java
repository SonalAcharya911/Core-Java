package com.xworkz.overriding.internal;

public class PowerSource {
    private String type;
    private double capacity;

    public void setType(String type){
        this.type = type;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("capacity: " + capacity);
        return "";
    }

    public PowerSource(){
        System.out.println("no-arg constructor for PowerSource");
    }
    public void supplyPowerSource() {
        System.out.println("running supplyPowerSource in PowerSource");
    }
}
