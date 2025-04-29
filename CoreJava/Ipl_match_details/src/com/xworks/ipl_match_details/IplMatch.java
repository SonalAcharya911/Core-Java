package com.xworks.ipl_match_details;

import java.util.Arrays;

public class IplMatch {

    public void change(String str){
        String input=str;
        String output="";

        String[] words=str.split(" ");
        for(String word:words){
            if(word.equals("win")||word.equals("the")){
                String rev="";
                System.out.println("==========");
                for(int i=word.length()-1;i>=0;i--) {
                    rev = rev + word.charAt(i);
                }
                System.out.println(rev);
                word=rev;
            }
            output=output+" "+word;

        }
        System.out.println("input: "+input);
        System.out.println("output: "+output);
    }
    //rcb will win the match against csk
    public void letterCount(String str){

        String[] words=str.split(" ");
        for(String word:words){
            System.out.print(" "+word.length());
        }

    }

    public void vowelCounter(String str){
        int vowel=0;
        int consonant=0;
        for(int i=0;i<str.length();i++){
            char alph=str.charAt(i);

            if (alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u'||alph=='A'||alph=='E'||alph=='I'||alph=='O'||alph=='U'){
                vowel++;
            }
            if(alph=='b'||alph=='c'||alph=='d'||alph=='f'||alph=='g'||alph=='h'||alph=='j'||alph=='k'||alph=='l'||alph=='m'||
            alph=='n'||alph=='q'||alph=='p'||alph=='r'||alph=='s'||alph=='t'||alph=='y'||alph=='v'||alph=='w'||alph=='x'||alph=='z'||alph=='T'){
                consonant++;
            }
        }

        System.out.println("no of vowels: "+vowel);
        System.out.println("no of consonants: "+consonant);
    }

    public void replaceVowel(String str){
        String temp=str;
        char[] letters=str.toCharArray();
        System.out.println(letters);
        for(char letter:letters){
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                letter= (char) (letter+1);
            }
            System.out.print(letter);
        }

    }

    public void swapStrings(String str1,String str2){
        System.out.println("Before Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        str1 = str1 + str2;

        str2 = str1.substring(0, str1.length() - str2.length());

        str1 = str1.substring(str2.length());

        System.out.println("After Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    public void sentenceCase(String sentence){
        String[] words = sentence.split(""); // Splits into characters
        String output = "";

        for (int index = 0; index < words.length; index++) {
            if (index == 0 || words[index - 1].equals(" ")) {
                words[index] = words[index].toUpperCase();
            }

            output = output + words[index]; // Add current character to output
        }

        System.out.println(output);


    }




}
