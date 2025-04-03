package com.xworkz.umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
         Umbrella umbrella=new Umbrella();
         Person person=new Person();

         if(person!=null){
             person.holds(umbrella);
         }
         else{
             System.out.println("person is null");
         }
    }
}
