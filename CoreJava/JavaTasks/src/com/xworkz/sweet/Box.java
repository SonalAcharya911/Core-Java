package com.xworkz.sweet;

public class Box {
    Sweet sweet;
    public Box(Sweet sweet){
        this.sweet=sweet;
        System.out.println("parameterized constructor for Box");
    }
    public void open(){
        System.out.println("running open in Box");
        if(sweet!=null){
            sweet.happiness();
        }
        else{
            System.err.println("sweet is null");
        }
    }
}
