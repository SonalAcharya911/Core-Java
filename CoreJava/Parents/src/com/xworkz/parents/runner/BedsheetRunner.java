package com.xworkz.parents.runner;

import com.xworkz.parents.internal.Bedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet=new Bedsheet("Cotton","Blue",750,"Double");
        Bedsheet bedsheet1=new Bedsheet("Microfibre","yellow",450,"single");
        Bedsheet bedsheet2=new Bedsheet("Cotton","Blue",750,"Double");

        boolean match=bedsheet.equals(bedsheet2);
        boolean notMatch=bedsheet.equals(bedsheet1);

        System.out.println("match: "+match);
        System.out.println("notMatch: "+notMatch);
    }


}
