package com.xworkz.sweet;

public class Box {
    public void open(Sweet sweet){
        System.out.println("running open in Box");
        if(sweet!=null){
            sweet.happiness();
        }
        else{
            System.err.println("sweet is null");
        }
    }
}
