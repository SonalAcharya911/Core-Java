package com.xworkz.beach.internal;

public class Beach {
    public Beach(){
        System.out.println("no-arg constructor for  Beach");
    }

    public void sunset(){
        System.out.println("running sunset in Beach");
        playVolleyBall();
    }

    void playVolleyBall(){
        System.out.println("running playVolleyBall in Beach");
        wave();
    }

    private void wave(){
        System.out.println("running wave in Beach");
    }
}
