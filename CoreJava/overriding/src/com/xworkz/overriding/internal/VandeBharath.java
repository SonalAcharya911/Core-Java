package com.xworkz.overriding.internal;

public class VandeBharath extends Train{
    public VandeBharath(){
        System.out.println("no-arg constructor for VandeBharath");
    }
    public void rideTrain() {
        System.out.println("running rideTrain in VandeBharath");
    }
    public void orderFood(){
        System.out.println("running orderFood in VandeBharath ");
    }
}
