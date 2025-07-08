package com.xworkz.appnest.runner;

import java.io.Serializable;
import java.util.*;

public class GuideMap {
    public static void main(String[] args) {
        //Create
        Map<Integer,String> gmap=new HashMap();
        gmap.put(25,"Ramesh");
        gmap.put(37,"Nivin");
        gmap.put(43,"Aju");

        //Read
        gmap.forEach((key,value)-> System.out.println(key+"-"+value));
        System.out.println(gmap.containsKey(25));
        System.out.println(gmap.get(37));
        gmap.values().stream().forEach(System.out::println);

        //Update
        gmap.putIfAbsent(45,"Joseph");
        gmap.values().stream().forEach(System.out::println);

        //Delete
        gmap.remove(21);
        gmap.remove(37);
        System.out.println(gmap.remove(25,"Ramesh"));
        System.out.println("=======================");
        gmap.clear();
        gmap.values().stream().forEach(System.out::println);




    }
}
