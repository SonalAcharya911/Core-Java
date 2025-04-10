package com.xworkz.acquired.internal;

public class Lock extends Security{
    public Lock(){
        System.out.println("no-arg constructor for Lock");
    }

    public void unlock(){
        System.out.println("running unlock in Lock");
        Security security=new Security();
        Security security1=new Lock();
    }
}
