package com.xworkz.acquired.internal;

public class Sneaker extends Shoe{
    public Sneaker(){
        System.out.println("no-arg constructor for Sneaker");
    }

    public void wear(){
        System.out.println("running wear in Shoe");
        Accessory accessory=new Accessory();
        Accessory accessory1=new Shoe();
        Accessory accessory2=new Sneaker();

        Shoe shoe=new Shoe();
        Shoe shoe1=new Sneaker();


    }
}
