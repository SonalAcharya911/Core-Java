package com.xworkz.overriding.internal;

public class SearchEngine {
    private String name;
    private String company;

    public void setName(String name){
        this.name = name;
    }

    public void setCompany(String company){
        this.company = company;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("company: " + company);
        return "";
    }

    public SearchEngine(){
        System.out.println("no-arg constructor for SearchEngine");
    }
    public void useSearchEngine() {
        System.out.println("running useSearchEngine in SearchEngine");
    }
}
