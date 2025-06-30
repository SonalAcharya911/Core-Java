package com.xworkz.groupism.task;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Furniture {
    public static void main(String[] args) {
        Set<String> furnitures=new LinkedHashSet<>();

        furnitures.add("Table");
        furnitures.add("Chair");
        furnitures.add("Sofa");
        furnitures.add("Coat");
        furnitures.add("Wardrobes");
        furnitures.add("Dressing Table");

        Iterator<String> iterator= furnitures.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
