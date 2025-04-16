package com.xworkz.overriding.internal;

public class Serum {
    private String brand;
    private String purpose;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        System.out.println("brand: " + brand);
        System.out.println("purpose: " + purpose);
        return "";
    }

    public Serum(){
        System.out.println("no-arg constructor for Serum");
    }
    public void applySerum() {
        System.out.println("running applySerum in Serum");
    }
}
