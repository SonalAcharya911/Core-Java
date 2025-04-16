package com.xworkz.overriding.internal;

public class Snack {
    private String name;
    private double calories;

    public void setName(String name){
        this.name = name;
    }

    public void setCalories(double calories){
        this.calories = calories;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("calories: " + calories);
        return "";
    }

    public Snack(){
        System.out.println("no-arg constructor for Snack");
    }
    public void eatSnack() {
        System.out.println("running eatSnack in Snack");
    }
}
