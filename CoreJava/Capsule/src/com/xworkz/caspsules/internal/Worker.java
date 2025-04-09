package com.xworkz.caspsules.internal;

public class Worker {
    public Worker(){
        System.out.println("no-arg constructor for Worker");
    }

    public void work(){

        System.out.println("running work in Worker");
        Occupation occupation = new Occupation();

        System.out.println("Occupation Name: " + occupation.getName());
        System.out.println("Occupation Field: " + occupation.getField());
        System.out.println("Occupation Years: " + occupation.getYears());
        System.out.println("Occupation Salary: " + occupation.getSalary());
        System.out.println("Occupation Remote: " + occupation.getRemote());

        occupation.setName("Engineer");
        occupation.setField("Software");
        occupation.setYears(5);
        occupation.setSalary(75000.00);
        occupation.setRemote(false);

        System.out.println("updated Occupation Name: " + occupation.getName());
        System.out.println("updated Occupation Field: " + occupation.getField());
        System.out.println("updated Occupation Years: " + occupation.getYears());
        System.out.println("updated Occupation Salary: " + occupation.getSalary());
        System.out.println("updated Occupation Remote: " + occupation.getRemote());
    }
}

