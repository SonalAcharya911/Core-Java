package com.xworkz.village;

public class Citizen {
    Village[] village;
    private String name;
    private int age;

    public Citizen(String name,int age,Village[] village){
        this.name=name;
        this.age=age;
        this.village=village;
    }

    public void displayDetails(){
        System.out.println("name: "+name+" age: "+age);
        for(Village vil:village){
            vil.showInfo();
        }
    }
}
