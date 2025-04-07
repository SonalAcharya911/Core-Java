package com.xworkz.comb.internal;

public class HairStyle {
    public HairStyle(){
        System.out.println("no-arg constructor in Hairstyle ");
    }

    public void brush(){
        System.out.println("running brush in HairStyle");
        Comb comb=new Comb();
        comb.sectionHair();
        comb.bristle();
    }
}
