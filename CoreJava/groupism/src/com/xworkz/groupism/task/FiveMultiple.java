package com.xworkz.groupism.task;

import java.util.LinkedHashSet;
import java.util.Set;

public class FiveMultiple {
    public static void main(String[] args) {
        Set<Integer> multiples=new LinkedHashSet<>();

        multiples.add(5);
        multiples.add(10);
        multiples.add(15);
        multiples.add(10);
        multiples.add(20);

        System.out.println(multiples);
    }
}
