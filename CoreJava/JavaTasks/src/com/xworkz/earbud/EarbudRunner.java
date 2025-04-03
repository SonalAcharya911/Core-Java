package com.xworkz.earbud;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud=new Earbud();
        Saahil saahil=new Saahil();

        if(saahil!=null){
            saahil.wears(earbud);
        }
        else{
            System.err.println("saahil is null");
        }
    }
}
