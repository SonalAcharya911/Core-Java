package com.xworkz.overriding.internal;

public class Berry {
    private String color;
    private String taste;
    public Berry(String color,String taste){
        this.color=color;
        this.taste=taste;
    }

    @Override
    public String toString() {
        System.out.println(color);
        System.out.println(taste);
        return "";
    }

    public Berry(){
        System.out.println("no-arg constructor for Berry");
    }
    public void taste() {
        System.out.println("running taste in Berry");
    }
}
