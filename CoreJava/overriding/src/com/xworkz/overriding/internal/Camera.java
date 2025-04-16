package com.xworkz.overriding.internal;

public class Camera {
    private String model;
    private int resolution;
    public Camera(String model,int resolution){
        this.model=model;
        this.resolution=resolution;
    }

    @Override
    public String toString() {
        System.out.println(this.model);
        System.out.println(this.resolution);
        return "";
    }

    public Camera(){
        System.out.println("no-arg constructor for Camera");
    }
    public void capture() {
        System.out.println("running capture in Camera");
    }
}
