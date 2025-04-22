package com.xworkz.parents.abstractClasses;

public abstract class AbstractOrnament {
    public AbstractOrnament(){
        System.out.println("no arg const of AbstractOrnament");
    }
    public void wear(){
        System.out.println("running wear in AbstractOrnament");
    }
    public void sell(){
        System.out.println("running sell in AbstractOrnament");
    }
    public abstract void make();
    public abstract void melt();


}
