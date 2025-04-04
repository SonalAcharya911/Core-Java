package com.xworkz.property;

public class Owner {
    String name;
    int age;
    Property[] property;
    
    public Owner(String name,int age,Property[] property){
        this.name=name;
        this.age=age;
        this.property=property;
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age);
        for(Property prop:property){
            prop.display();
        }
    }
}
