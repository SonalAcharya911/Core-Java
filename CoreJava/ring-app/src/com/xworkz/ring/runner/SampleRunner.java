package com.xworkz.ring.runner;

public class SampleRunner {
    public static void main(String[] args) {
        System.out.println(valid( "example@gmail.com"));


    }
    public static boolean valid(String str){

        if(str.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-z]{2,}")) {
            System.out.println("");
            return true;
        }
        return false;
    }
    public static void countwords(String str){
        String[] words=str.split(" ");
        System.out.println(words.length);

    }


}
