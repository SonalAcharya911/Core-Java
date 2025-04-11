package com.xworkz.overriding.internal;

public class Honda extends Brand{
    public Honda(){
        System.out.println("no-arg constructor for Honda");
    }
    public void promote() {
        System.out.println("running promote in Honda");
    }
}
