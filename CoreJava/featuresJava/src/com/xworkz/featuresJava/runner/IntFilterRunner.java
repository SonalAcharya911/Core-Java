package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.IntFilter;

public class IntFilterRunner {
    public static void main(String[] args) {
        IntFilter intFilter=new IntFilter() {
            @Override
            public boolean filter(int number) {
                if(number>10||number<5){
                    return true;
                }
                else return false;
            }
        };
        int[] numbers={10,2,4,8,9,11,23,1,3,4,6,7};
        for(int number:numbers){
            if(intFilter.filter(number)){
                System.out.println(number);
            }
        }
    }
}
