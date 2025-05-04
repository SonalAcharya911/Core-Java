package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.StringPrinter;

public class PrintStringRunner {
    public static void main(String[] args) {
        StringPrinter stringPrinter=(str)-> {
            if (str.length()>7){
                System.out.println(str);
            }
        };

        String[] veggies={"carrot", "beans", "capsicum", "tomato", "cucumber"};
        for (String veg:veggies){
            stringPrinter.longerThan(veg);
        }
    }
}
