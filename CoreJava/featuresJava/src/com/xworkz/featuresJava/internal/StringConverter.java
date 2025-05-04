package com.xworkz.featuresJava.internal;

@FunctionalInterface

public interface StringConverter {
    String convert(String str);

    static void convertAndPrint(String[] arr, StringConverter converter) {
        for (String str : arr) {
            System.out.println(converter.convert(str));
        }
    }

}
