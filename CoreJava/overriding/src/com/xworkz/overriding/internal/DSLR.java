package com.xworkz.overriding.internal;

public class DSLR extends Camera{
    public DSLR(){
        System.out.println("no-arg constructor for DSLR");
    }
    public void capture() {
        System.out.println("running capture in DSLR");
    }

    public void clickPic(){
        System.out.println("running clickPic in DSLR");
    }

}
