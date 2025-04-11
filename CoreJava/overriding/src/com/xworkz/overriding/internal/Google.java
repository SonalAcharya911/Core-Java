package com.xworkz.overriding.internal;

public class Google extends SearchEngine {
    public Google(){
        System.out.println("no-arg constructor for Google");
    }
    public void search() {
        System.out.println("running search in Google");
    }
    public void useSearchEngine() {
        System.out.println("running useSearchEngine in SearchEngine");
    }
}
