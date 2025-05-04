package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.Palindrome;

public class PalindromeRunner {
    public static void main(String[] args) {
        Palindrome palindrome=(str)->{
            String rev="";

            for(int i=(str.length()-1);i>=0;i--){
                rev=rev+str.charAt(i);
            }

            if(str.equals(rev)){
                System.out.println("string is palindrome");
            }
            else{
                System.out.println("string is not palindrome");
            }
        };
        String string="sonalanos";
        System.out.println(string.charAt(8));
        palindrome.isPalindrome("malayalam");
    }
}
