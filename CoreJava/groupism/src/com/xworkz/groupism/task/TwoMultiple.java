package com.xworkz.groupism.task;

import java.util.HashSet;
import java.util.Set;

public class TwoMultiple {
    public static void main(String[] args) {
        Set<Integer> twoMultiples=new HashSet<>();
        twoMultiples.add(2);
        twoMultiples.add(4);
        twoMultiples.add(6);
        twoMultiples.add(8);
        System.out.println("Before removing 6: "+twoMultiples);

        twoMultiples.remove(6);
        System.out.println("After removing 6: "+twoMultiples);

    }
}
