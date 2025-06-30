package com.xworkz.groupism.task;

import java.util.*;

public class ArrayHashAdd {
    public static void main(String[] args) {
        List<String> clothes=new ArrayList<>();
        clothes.add("Kurti");
        clothes.add("Top");
        clothes.add("Saree");
        clothes.add("Shawl");
        clothes.add("Coat");


        Set<String> bottomWear=new HashSet<>();
        bottomWear.add("jeans");
        bottomWear.add("shorts");
        bottomWear.add("pants");


        bottomWear.addAll(clothes);


        System.out.println(bottomWear);
    }
}
