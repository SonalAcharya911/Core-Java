package com.xworkz.acquired.internal;

public class LED extends Light {
    public LED(){
        System.out.println("no-arg constructor for LED");
    }
    public void off(){
        System.out.println("running off in LED");
        Light light=new Light();
        Light light1=new LED();
    }
}
