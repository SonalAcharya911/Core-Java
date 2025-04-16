package com.xworkz.overriding.internal;

public class Container {
    private double capacity;

    private String material;
    public Container(double capacity,String material){
        this.capacity=capacity;
        this.material=material;
    }

    @Override
    public String toString() {
        System.out.println("capacity: " + capacity);
        System.out.println("material:  " + material);
        return "";
    }

    public Container(){
        System.out.println("no-arg constructor for Container");
    }


    public void hold() {
        System.out.println("running hold in Container");
    }
}
