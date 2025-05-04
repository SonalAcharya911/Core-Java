package com.xworkz.featuresJava.runner;

import static com.xworkz.featuresJava.internal.StringConverter.convertAndPrint;

public class StringConverterRunner {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};


        System.out.println("Uppercase:");
        convertAndPrint(names, (s) -> s.toUpperCase());

        System.out.println("\nLowercase:");
        convertAndPrint(names, (s) -> s.toLowerCase());

    }
}
