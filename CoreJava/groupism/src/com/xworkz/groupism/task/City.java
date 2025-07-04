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

        System.out.println("==========================");
        String result="";
        System.out.println("Cities: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("======================");

        while(iterator.hasNext()){
            if(iterator.next().equals("Chennai")){
                iterator.remove();
            }
            result=iterator.next().replace("Chennai","Ahmedabad");
        }

        System.out.println(result);

        if(cities.contains("Hello")){
            System.out.println("Hello present");
        }
        else{
            System.out.println("Hello absent");
        }



    }
}
