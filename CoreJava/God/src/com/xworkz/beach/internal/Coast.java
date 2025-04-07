package com.xworkz.beach.internal;

public class Coast {

    public Coast(){
        System.out.println("no-arg constructor for Coast");
    }

    public void contains(){
        System.out.println("running contains in Beach");
        Beach beach=new Beach();
        beach.sunset();
        System.out.println("==============================================");
        beach.playVolleyBall();
    }


}
