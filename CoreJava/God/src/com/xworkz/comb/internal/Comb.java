package com.xworkz.comb.internal;

public class Comb {
    public Comb() {
        System.out.println("no-arg constructor in Comb ");
    }

    private void combHair() {
        System.out.println("running combHair in Comb");
    }

    void sectionHair() {
        System.out.println("running sectionHair in Comb");
        combHair();
    }

    public void bristle() {
        System.out.println("running bristle in Comb");
        sectionHair();
    }
}
