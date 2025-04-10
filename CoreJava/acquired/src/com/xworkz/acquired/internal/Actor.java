package com.xworkz.acquired.internal;

public class Actor extends Person{
    public Actor(){
        System.out.println("no-arg constructor for Actor");
    }

    public void act(){
        System.out.println("running act in Actor");
        Human human=new Human();
        Human human1=new Person();
        Human human2=new Actor();

        Person person=new Person();
        Person person1=new Actor();

    }
}
