package com.xworkz.parents.abstractClasses;

public class Salesman extends AbstractJob{
    public Salesman(String roleName){
        super(roleName);
        System.out.println("String const of Salesman");
    }

    @Override
    public void work() {
        System.out.println("runnin work in Salesman");
    }
}
