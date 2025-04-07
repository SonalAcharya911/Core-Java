package com.xworkz.perfume.external;

import com.xworkz.perfume.internal.Perfume;

public class Man {
    public Man(){
        System.out.println("no-arg constructor in Man");
    }

    public void wear(){
        System.out.println("running wear in Man");
        Perfume perfume=new Perfume();
        perfume.mist();
    }
}
