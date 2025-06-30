package com.xworkz.groupism.task;

import java.util.*;

public class Fruit {
    public static void main(String[] args) {
        Set<String> fruits= new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Papaya");

        System.out.println(fruits);
        System.out.println("=====================");
        fruits.add("Apple");
        System.out.println(fruits);

        if(fruits.isEmpty()){
            System.out.println("Fruit Set is empty");
        }
        else{
            System.out.println("Fruits Set is not empty");
        }

        if(fruits.contains("Banana")){
            System.out.println("Fruits Set contains Banana");

        }
        else{
            System.out.println("Fruits set does not contain Banana");
        }

        List<String> list=new ArrayList<>();
        list.addAll(fruits);



    }
}
