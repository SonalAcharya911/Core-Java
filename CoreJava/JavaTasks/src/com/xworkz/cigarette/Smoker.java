package com.xworkz.cigarette;

public class Smoker {

    public void smokes(Cigarette cigarette){
        System.out.println("running smokes in Smoker");
        if(cigarette!=null){
            cigarette.kill();
        }
        else{
            System.err.println("cigarette is null");
        }
    }
}
