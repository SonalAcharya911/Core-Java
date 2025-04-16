package com.xworkz.overriding.internal;

public class InputDevice {
    private String type;
    private String brand;

    public InputDevice(String type, String brand){
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("brand: " + brand);
        return "";
    }

    public InputDevice(){
        System.out.println("no-arg constructor for InputDevice");
    }
    public void input() {
        System.out.println("running input in InputDevice");
    }
}
