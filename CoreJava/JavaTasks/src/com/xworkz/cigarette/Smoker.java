package com.xworkz.cigarette;

public class Smoker {
    Cigarette cigarette;
    public Smoker(Cigarette cigarette){
        this.cigarette=cigarette;
        System.out.println("parameterized constructor for Cigarette");
    }
    public void smokes(){
        System.out.println("running smokes in Smoker");
        if(cigarette!=null){
            cigarette.kill();
        }
        else{
            System.err.println("cigarette is null");
        }
    }
}
