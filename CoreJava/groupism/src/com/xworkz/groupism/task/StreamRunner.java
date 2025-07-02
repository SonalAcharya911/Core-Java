package com.xworkz.groupism.task;

import java.util.*;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();

        collection.add(21);
        collection.add(32);
        collection.add(43);
        collection.add(54);
        collection.add(65);
        collection.add(76);
        collection.add(87);
        collection.add(98);
        collection.add(50);
        System.out.println("Original collection: "+collection);

    collection
            .stream()
            .filter(e->e<50)
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);

       // Collections.sort((List)collection);



    }
}
