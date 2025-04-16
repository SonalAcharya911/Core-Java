package com.xworkz.overriding.internal;

public class Desert {
    private String name;
    private double area;
    public Desert(String name,double area){
        this.name=name;
        this.area=area;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("area: " + area);
        return "";
    }

    public Desert(){
        System.out.println("no-arg constructor for Desert");
    }
    public void heat() {
        System.out.println("running heat in Desert");
    }
}
