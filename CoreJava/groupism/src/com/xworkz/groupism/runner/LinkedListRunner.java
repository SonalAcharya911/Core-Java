package com.xworkz.groupism.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class LinkedListRunner {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        cities.add("Bangalore");
        cities.add("Lucknow");
        cities.add("Mumbai");
        cities.add("Thiruvananthapuram");
        cities.add("Hyderabad");
        cities.add("Chennai");

        String value=cities.get(0);
        System.out.println(value);

        Spliterator<String> spliterator=cities.spliterator();

        cities.hashCode();

        List<String> sublist=cities.subList(2,4);
        sublist.stream().forEach(System.out::println);
    }
}
