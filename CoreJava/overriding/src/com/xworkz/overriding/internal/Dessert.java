package com.xworkz.overriding.internal;

public class Dessert {
    private String flavor;

    private double calories;

    public Dessert(String flavor,double calories){
        this.flavor=flavor;
        this.calories=calories;
    }

    @Override
    public String toString() {
        System.out.println("flavor: " + flavor);
        System.out.println("calories: " + calories);
        return "";
    }

    public Dessert(){
        System.out.println("no-arg constructor for Dessert");
    }
    public void enjoy() {
        System.out.println("running enjoy in Dessert");
    }


}
