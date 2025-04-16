package com.xworkz.overriding.internal;

public class Fruit {
    private String name;

    private String taste;
    public Fruit(String name,String taste){
        this.name=name;
        this.taste=taste;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("taste: " + taste);
        return "";
    }

    public Fruit(){
        System.out.println("no-arg constructor for Fruit");
    }
    public void eatFruit() {
        System.out.println("running eatFruit in Fruit");
    }
}
