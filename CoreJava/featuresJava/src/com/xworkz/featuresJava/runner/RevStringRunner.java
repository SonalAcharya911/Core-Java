package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.RevString;

public class RevStringRunner {
    RevString revString=new RevString() {
        @Override
        public void reverse(String string) {
            String rev="";

            for(int i=(string.length()-1);i>=0;i--){
                rev=rev+string.charAt(i);
            }

            System.out.println("reversed string is: "+rev);

        }
    };
}
