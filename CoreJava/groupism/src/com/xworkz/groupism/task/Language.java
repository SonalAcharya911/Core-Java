package com.xworkz.groupism.task;

import java.util.ArrayList;
import java.util.List;

public class Language {
    public static void main(String[] args) {
        List<String> languages=new ArrayList<>();
        languages.add("Python");
        languages.add("R");
        languages.add("Java");
        languages.add("C");
        languages.add("C++");

        if(languages.contains("Java")){
            System.out.println("Array contains Java");
        }
        else{
            System.out.println("Array does not contain Java");
        }
    }
}
