package com.xworkz.earbud;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud=new Earbud();
        Saahil saahil=new Saahil(earbud);
        saahil.wears();
    }
}
