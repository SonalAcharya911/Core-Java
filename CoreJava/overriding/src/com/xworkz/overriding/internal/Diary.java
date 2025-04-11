package com.xworkz.overriding.internal;

public class Diary extends Notebook{
    public Diary(){
        System.out.println("no-arg constructor for Diary");
    }
    public void writeDiary() {
        System.out.println("running writeDiary in Diary");
    }
    public void writeNotebook() {
        System.out.println("running writeNotebook in Diary");
    }
}
