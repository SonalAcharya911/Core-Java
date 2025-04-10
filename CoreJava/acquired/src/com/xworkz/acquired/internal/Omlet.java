package com.xworkz.acquired.internal;

public class Omlet extends SideDish {
    public Omlet(){
        System.out.println("no-arg constructor for Food");
    }

    public void eat(){
        Dish dish=new Dish();
        Dish dish1=new SideDish();
        Dish dish2=new Omlet();

        SideDish sideDish=new SideDish();
        SideDish sideDish1=new Omlet();

    }
}
