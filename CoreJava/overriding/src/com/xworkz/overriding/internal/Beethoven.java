package com.xworkz.overriding.internal;

public class Beethoven extends Composer{
    public Beethoven(){
        System.out.println("no-arg constructor for Beethoven");
    }
    public void compose() {
        System.out.println("running compose in Beethoven");
    }

    @Override
    public void orchestrate() {
        System.out.println("running orchestrate in Beethoven");
    }
}
