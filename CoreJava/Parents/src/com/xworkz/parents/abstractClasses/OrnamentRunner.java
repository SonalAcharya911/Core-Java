package com.xworkz.parents.abstractClasses;

public class OrnamentRunner {
    public static void main(String[] args) {
        AbstractOrnament ornament=new Earring();
        ornament.make();
        ornament.melt();
        ornament.sell();
        ornament.wear();

    }
}
