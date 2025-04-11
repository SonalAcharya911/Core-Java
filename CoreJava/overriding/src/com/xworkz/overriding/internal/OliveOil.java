package com.xworkz.overriding.internal;

public class OliveOil extends Oil {
    public OliveOil(){
        System.out.println("no-arg constructor for OliveOil");
    }
    public void applyOil() {
        System.out.println("running applyOil in OliveOil");
    }
    public void cookWithOliveOil() {
        System.out.println("running cookWithOliveOil in OliveOil");
    }
}
