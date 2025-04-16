package com.xworkz.overriding.internal;

public class Piano {
    private String model;
    private int keys;

    public void setModel(String model){
        this.model = model;
    }

    public void setKeys(int keys){
        this.keys = keys;
    }

    @Override
    public String toString() {
        System.out.println("model: " + model);
        System.out.println("keys: " + keys);
        return "";
    }

    public Piano(){
        System.out.println("no-arg constructor for Piano");
    }

    public void play(){
        System.out.println("running play in Piano");
    }

}
