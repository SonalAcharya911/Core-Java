package com.xworkz.earbud;

public class Saahil {
    public void wears(Earbud earbud){
        System.out.println("running wears in Saahil");
        if(earbud!=null){
            earbud.playMusic();
        }
        else{
            System.err.println("earbud is null");
        }
    }
}
