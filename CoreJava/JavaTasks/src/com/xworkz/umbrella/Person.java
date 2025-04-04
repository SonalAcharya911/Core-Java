package com.xworkz.umbrella;

public class Person {
    Umbrella umbrella;
    public Person(Umbrella umbrella){
        this.umbrella=umbrella;
        System.out.println("parameterized constructor for Person");
    }
     public void holds(){
         System.out.println("running holds in Person");
         if(umbrella!=null){
             umbrella.opens();
         }
         else{
             System.err.println("umbrella is null");
         }
     }
}
