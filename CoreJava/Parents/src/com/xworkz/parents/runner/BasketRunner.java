package com.xworkz.parents.runner;

import com.xworkz.parents.internal.Basket;

public class BasketRunner {
    public static void main(String[] args) {
        Basket basket1=new Basket("brown","wood",200,190);
        Basket basket2=new Basket("brown","wood",200,190);
        Basket basket3=new Basket("yellow","plastic",400,300);

        boolean match=basket1.equals(basket2);
        boolean notMatch=basket2.equals(basket3);

        System.out.println("match: " + match);
        System.out.println("notMatch: " + notMatch);
    }
}
