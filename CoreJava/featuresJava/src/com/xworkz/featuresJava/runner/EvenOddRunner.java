package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.EvenOdd;

public class EvenOddRunner {
    public static void main(String[] args) {
        EvenOdd evenOdd= new EvenOdd() {
            @Override
            public void even(int num) {
                if(num%2==0){
                    System.out.println("num is even");
                }
                else {
                    System.out.println("num is odd");
                }
            }
        };

        evenOdd.even(10);

        EvenOdd odd=(num)->{
            if (num%2==0){
                System.out.println("num is even");
            }
            else {
                System.out.println("num is odd");
            }
        };

        odd.even(13);
    }
}
