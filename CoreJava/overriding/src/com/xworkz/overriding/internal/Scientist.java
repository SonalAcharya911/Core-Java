package com.xworkz.overriding.internal;

public class Scientist {
    private String field;
    private String name;

    public void setField(String field){
        this.field = field;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("field: " + field);
        System.out.println("name: " + name);
        return "";
    }

    public Scientist(){
        System.out.println("no-arg constructor for Scientist");
    }
    public void researchScientist() {
        System.out.println("running researchScientist in Scientist");
    }
}
