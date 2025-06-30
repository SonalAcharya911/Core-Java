package com.xworkz.groupism.task;

import java.util.*;

public class Friends {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        names.add("Saahil");
        names.add("Vidya");
        names.add("Devika");
        names.add("Hema");
        names.add("Nagesh");
        names.add("Chirag");
        names.add("Sumaiya");
        names.add("Hephzibah");
        names.add("Dhanyashree");
        names.add("Padmini");
        names.add("Nikitha");
        names.add("Krishnaveni");
        names.add("Mahalakshmi");

        System.out.println(names);

        Object[] friends=names.toArray();

        Arrays.sort(friends);
        for(Object friend: friends){
            System.out.println(friend);
        }
        System.out.println("======================");
        int sizeOfList= names.size();
        System.out.println("size of names list: "+ sizeOfList);

        names.removeAll(names);

        System.out.println(names);
        System.out.println("end");
    }
}
