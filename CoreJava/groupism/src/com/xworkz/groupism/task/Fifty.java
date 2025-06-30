package com.xworkz.groupism.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Fifty {
    public static void main(String[] args) {
        Collection<Integer> numbers=new ArrayList<>();
        numbers.add(34);
        numbers.add(98);
        numbers.add(21);
        numbers.add(18);
        numbers.add(73);
        numbers.add(45);
        numbers.add(57);

        int maxNumber= Collections.max(numbers);
        System.out.println(maxNumber);

        Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()>50){
                iterator.remove();
            }
        }

        System.out.println("==========");
        int i=0;
        for(int number: numbers){
            System.out.println("value: "+number);
            System.out.println("index: "+i++);
        }






    }
}
