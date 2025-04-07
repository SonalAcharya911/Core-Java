package com.xworkz.comb.external;

import com.xworkz.comb.internal.Comb;

public class Salon {
    public Salon(){
        System.out.println("no-arg constructor in Salon");
    }

    public void holds(){
        System.out.println("running holds in Salon");
        Comb comb=new Comb();
        comb.bristle();
    }

}
