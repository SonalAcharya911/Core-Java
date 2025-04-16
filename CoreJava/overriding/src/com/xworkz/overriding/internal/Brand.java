package com.xworkz.overriding.internal;

public class Brand {
    private String label;
    private double value;

    public Brand(String label,double value){
        this.label=label;
        this.value=value;
    }

    @Override
    public String toString() {
        System.out.println(label);
        System.out.println(value);
        return "";
    }
    public Brand(){
        System.out.println("no-arg constructor for Brand");
    }
    public void promote() {
        System.out.println("running promote in Brand");
    }
}
