package com.xworkz.overriding.internal;

public class Backup {
    private String date;
    private double size;

    public Backup(String date,double size){
        this.date=date;
        this.size=size;
    }

    @Override
    public String toString() {
        System.out.println(date);
        System.out.println(size);
        return "";
    }

    public Backup(){
        System.out.println("no-arg constructor for Backup");
    }
    public void store() {
        System.out.println("running store in Backup");
    }

}
