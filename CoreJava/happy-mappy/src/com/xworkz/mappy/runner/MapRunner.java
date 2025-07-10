package com.xworkz.mappy.runner;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(101,"Sonal");
        map.put(102,"Saahil");
        map.put(103,"Vinod");
        map.put(104,"Vidya");
        map.put(105,"Vipin");
        map.put(106,"Vimal");
        map.put(107,"Srikumar");
        map.put(108,"Suresh");

        System.out.println("=========entrySet========");
        map.entrySet().forEach(System.out::println);

        System.out.println("=========forEach========");
        map.forEach((k,v)->map.put(k,v+k));
        map.entrySet().forEach(System.out::println);

        System.out.println("=========containsKey========");
        boolean result=map.containsKey(109);
        System.out.println(result);

        System.out.println("=========remove========");
        result=map.remove(106,"Vimal106");
        System.out.println(result);
        map.entrySet().forEach(System.out::println);


        System.out.println("=========replaceAll========");
        map.forEach((k,v)-> map.put(k,v.replaceAll(k.toString(),"")));
        map.entrySet().forEach(System.out::println);

        System.out.println("=========putIfAbsent========");
        map.putIfAbsent(106,"Vimal");
        map.entrySet().forEach(System.out::println);

        System.out.println("=========hashCode========");
        System.out.println(map.hashCode());

        System.out.println("=========isEmpty========");
        result=map.isEmpty();
        System.out.println(result);

        System.out.println("=========replace(3 param)======");
        map.replace(108,"Suresh","SureshKumar");
        map.entrySet().forEach(System.out::println);

        System.out.println("=========size========");
        int size=map.size();
        System.out.println(size);

        System.out.println("=========containsValue========");
        result=map.containsValue("Sonal");
        System.out.println(result);

        System.out.println("=========compute========");
        String value= map.compute(103,(k,v)->v.equals("Vinod")?"VinodKumar":"false");
        System.out.println(value);

        map.entrySet().forEach(System.out::println);




    }
}
