package com.xworks.ipl_match_details;

public class IplMatchRunner {
    public static void main(String[] args) {
        IplMatch iplMatch=new IplMatch();
        iplMatch.change("RCB will win the match");

        iplMatch.letterCount("rcb will win the match against csk");
        System.out.println("\n");
        iplMatch.vowelCounter("Today is my day, I will do best");
        System.out.println("\n");
        iplMatch.replaceVowel("you are welcome");
        System.out.println("\n");
        iplMatch.sentenceCase("Hi i am sonal");

    }
}
