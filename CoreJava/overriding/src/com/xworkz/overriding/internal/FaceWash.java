package com.xworkz.overriding.internal;

public class FaceWash extends Cleanser{
    public FaceWash(){
        System.out.println("no-arg constructor for FaceWash");
    }
    public void refresh() {
        System.out.println("running refresh in FaceWash");
    }

    public void cleanFace(){
        System.out.println("running cleanFace in FaceWash");
    }
}
