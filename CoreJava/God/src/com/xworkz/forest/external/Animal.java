package com.xworkz.forest.external;

import com.xworkz.forest.internal.Forest;

public class Animal {
    public Animal(){
        System.out.println("no-arg constructor for Animal");
    }

    public void hunt(){
        System.out.println("running hunt in Animal");
        Forest forest=new Forest();
        forest.plants();
    }
}
