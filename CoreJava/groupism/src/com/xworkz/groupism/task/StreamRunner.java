package com.xworkz.groupism.task;

import java.util.ArrayList;
import java.util.Collection;
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

        System.out.println("====================");

        Collection<Integer> numbers=new ArrayList<>();
        for(int coll: collection){
            if(coll>50){
                numbers.add(coll);
            }
        }

        System.out.println("numbers greater than 50: "+numbers);


        collection.stream().filter((e)->e>50)//Predicate true  --> strea
                .forEach(e-> System.out.println(e));// Consumer


    }
}
