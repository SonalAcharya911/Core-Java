package com.xworkz.groupism.task;

import java.util.*;

public class RandomTree {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(34);
        numbers.add(98);
        numbers.add(21);
        numbers.add(18);
        numbers.add(73);
        numbers.add(45);
        numbers.add(57);

        System.out.println(numbers);

        int minNum = Collections.min(numbers);
        int maxNum = Collections.max(numbers);
        System.out.println("least number is: " + minNum);
        System.out.println("largest number is: " + maxNum);

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()<50){
                iterator.remove();
            }
        }
        numbers.stream().filter(e->e==1).forEach(e-> System.out.println(e));


    }

}
