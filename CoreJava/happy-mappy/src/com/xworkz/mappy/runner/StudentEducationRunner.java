package com.xworkz.mappy.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentEducationRunner {
    public static void main(String[] args) {
        Map<String,String> studentEducationMap=new HashMap<>();

        studentEducationMap.put("Sonal","AIML");
        studentEducationMap.put("Divya","AU");
        studentEducationMap.put("Devika","CSE");
        studentEducationMap.put("Ayush","ISE");
        studentEducationMap.put("Akash","ISE");

        Set<Map.Entry<String,String>> entrySet= studentEducationMap.entrySet();

        entrySet.forEach(e->{
            System.out.println("key: "+e.getKey()+", value: "+e.getValue());
        });


    }
}
