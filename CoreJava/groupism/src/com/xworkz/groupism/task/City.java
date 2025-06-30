package com.xworkz.groupism.task;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class City {
    public static void main(String[] args) {
        List<String> cities=new LinkedList<>();

        cities.add("Bangalore");
        cities.add("Lucknow");
        cities.add("Mumbai");
        cities.add("Thiruvananthapuram");
        cities.add("Hyderabad");
        cities.add("Chennai");

        Iterator<String> iterator= cities.iterator();

        System.out.println("Cities: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
