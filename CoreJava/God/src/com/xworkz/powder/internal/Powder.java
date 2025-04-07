package com.xworkz.powder.internal;

public class Powder {
    public Powder(){
        System.out.println("no-arg constructor in Powder ");
    }

    public void setting(){
        System.out.println("running setting in Powder");
        talc();
        grind();
    }

    void talc(){
        System.out.println("running talc in Powder");
    }

    private void grind(){
        System.out.println("running grind in Powder");
    }
}
