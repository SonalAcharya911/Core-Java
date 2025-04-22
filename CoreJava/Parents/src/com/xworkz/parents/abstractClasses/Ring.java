package com.xworkz.parents.abstractClasses;

public abstract class Ring extends AbstractOrnament{
    public Ring(){
        System.out.println("no-arg const of Ring");
    }

    @Override
    public void make() {
        System.out.println("running make in Ring");
    }
}
