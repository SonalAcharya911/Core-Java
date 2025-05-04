package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.SubFilter;

public class SubFilterRunner {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "grape", "pineapple", "apricot"};

        String substring = "app";
        SubFilter filter = new SubFilter() {
            @Override
            public boolean containsSubstring(String str) {
                return str.contains(substring);
            }
        };
        System.out.println("Words containing '" + substring + "':");
        for (String word : words) {
            if (filter.containsSubstring(word)) {
                System.out.println(word);
            }
        }
    }

}
