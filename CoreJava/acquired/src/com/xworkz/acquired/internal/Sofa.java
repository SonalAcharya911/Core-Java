package com.xworkz.acquired.internal;

public class Sofa extends Furniture{
    public Sofa(){
        System.out.println("no-arg constructor for Sofa");
    }

    public void sit(){
        System.out.println("running sit in Sofa");
        Product product=new Product();
        Product product1=new Furniture();
        Product product2=new Sofa();

        Furniture furniture =new Furniture();
        Furniture furniture1=new Sofa();

    }
}
