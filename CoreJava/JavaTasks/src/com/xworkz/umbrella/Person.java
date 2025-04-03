package com.xworkz.umbrella;

public class Person {
     public void holds(Umbrella umbrella){
         System.out.println("running holds in Person");
         if(umbrella!=null){
             umbrella.opens();
         }
         else{
             System.err.println("umbrella is null");
         }
     }
}
