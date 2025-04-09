package com.xworkz.acquired.internal;

public class GoodDayBiscuit extends Biscuit{
    public GoodDayBiscuit(){
        System.out.println("no-arg constructor for GoodDayBiscuit");
    }
    public void dip(){
        System.out.println("running dip in GoodDayBiscuit");
        Food food=new Food();
        Food food1=new Snack();
        Food food2=new Biscuit();
        Snack snack=new Snack();
        Snack sncak1=new Biscuit();
        Biscuit biscuit=new Biscuit();

    }
}
