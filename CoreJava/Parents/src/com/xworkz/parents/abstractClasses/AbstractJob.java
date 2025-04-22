package com.xworkz.parents.abstractClasses;

public abstract class AbstractJob {

    public AbstractJob(String roleName){
        System.out.println("String const of AbstractJob");
        System.out.println("roleName: "+roleName);
    }

    public abstract void work();
}
