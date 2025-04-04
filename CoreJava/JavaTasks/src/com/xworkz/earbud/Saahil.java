package com.xworkz.earbud;

public class Saahil {
    Earbud earbud;
    public Saahil(Earbud earbud){
        this.earbud=earbud;
        System.out.println("parameterized constructor for Saahil");
    }
    public void wears(){
        System.out.println("running wears in Saahil");
        if(earbud!=null){
            earbud.playMusic();
        }
        else{
            System.err.println("earbud is null");
        }
    }
}
