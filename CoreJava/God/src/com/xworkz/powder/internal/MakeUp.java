package com.xworkz.powder.internal;

public class MakeUp {
    public MakeUp(){
        System.out.println("no-arg constructor in MakeUp ");
    }

    public void applies(){
        System.out.println("running applies in Powder");
        Powder powder=new Powder();
        powder.setting();
        powder.talc();
    }
}
