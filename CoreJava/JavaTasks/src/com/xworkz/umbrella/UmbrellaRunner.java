package com.xworkz.umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella=new Umbrella();
        Person person=new Person(umbrella);
        person.holds();
    }
}
