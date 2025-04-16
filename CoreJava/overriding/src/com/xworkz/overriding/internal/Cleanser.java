package com.xworkz.overriding.internal;

public class Cleanser {
    private String ingredients;
    private int volume;
    public Cleanser(String ingredients,int volume){
        this.volume=volume;
        this.ingredients=ingredients;
    }

    @Override
    public String toString() {
        System.out.println(this.volume);
        System.out.println(this.ingredients);
        return "";
    }

    public Cleanser(){
        System.out.println("no-arg constructor for Cleanser");
    }
    public void refresh() {
        System.out.println("running refresh in Cleanser");
    }

}
