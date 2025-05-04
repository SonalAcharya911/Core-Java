package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.StringChecker;

public class StringCheckerRunner {
    public static void main(String[] args) {
        StringChecker stringChecker= new StringChecker() {
            @Override
            public void checkString() {
                String[] fruits={"apple","banana", "mango", "orange","kiwi", "watermelon"};
                for(String fruit:fruits){
                    if(fruit.length()>5){
                        System.out.println(fruit);
                    }
                }
            }
        };
        stringChecker.checkString();
    }
}
