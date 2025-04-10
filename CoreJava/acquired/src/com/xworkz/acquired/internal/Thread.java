package com.xworkz.acquired.internal;

public class Thread extends Cotton{
    public Thread(){
        System.out.println("no-arg constructor for Thread");
    }

    public void weave(){
        System.out.println("running weave in Thread");
        Material material=new Material();
        Material material1=new Cotton();
        Material material2=new Thread();

        Cotton cotton=new Cotton();
        Cotton cotton1=new Thread();
    }
}
