package com.xworkz.powder.external;

import com.xworkz.powder.internal.Powder;

public class Carrom {
    public Carrom(){
        System.out.println("no-arg constructor in Carrom ");
    }

    public void sprinkle(){
        System.out.println("running sprinkle in Carrom");
        Powder powder=new Powder();
        powder.setting();
    }
}
