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



        cities.strint final index=0;
        cities.stream().filter(e->e.length()>6).forEach(e->{
            index++;
            System.out.println(index);
        });eam().filter(e->e.matches("Toy")).forEach(System.out::println);


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
