package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Occupation;

public class Manager {
    public void manage(){
        System.out.println("running manage in Manager");
        Occupation occupation = new Occupation();

        System.out.println("Occupation Name: " + occupation.getName());
        System.out.println("Occupation Field: " + occupation.getField());
        System.out.println("Occupation Years: " + occupation.getYears());
        System.out.println("Occupation Salary: " + occupation.getSalary());
        System.out.println("Occupation Remote: " + occupation.getRemote());
    }
}
