package com.xworkz.parents.abstractClasses;

public class Earring extends Ring{
    public Earring(){
        System.out.println("no arg const of Earring");
    }

    @Override
    public void melt() {
        System.out.println("running melt in Earring");
    }
}
