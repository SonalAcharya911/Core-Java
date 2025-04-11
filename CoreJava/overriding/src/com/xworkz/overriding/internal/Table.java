package com.xworkz.overriding.internal;

public class Table extends Furniture{
    public Table(){
        System.out.println("no-arg constructor for Table");
    }
    public void useFurniture() {
        System.out.println("running useFurniture in Table");
    }
    public void useTable() {
        System.out.println("running useTable in Table");
    }

}
