package com.xworkz.overriding.internal;

public class CPU extends Processor{
    public CPU(){
        System.out.println("no-arg constructor for CPU");
    }
    public void process() {
        System.out.println("running process in CPU");
    }


    public void useProcessor() {
        System.out.println("running useProcessor in CPU");
    }
}
