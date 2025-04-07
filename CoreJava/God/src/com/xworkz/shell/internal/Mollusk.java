package com.xworkz.shell.internal;

public class Mollusk {
    public Mollusk() {
        System.out.println("no-arg constructor in Mollusk ");
    }

    public void protect(){
        System.out.println("running protect in Mollusk");
        Shell shell=new Shell();
        shell.breaks();
        shell.cover();
    }
}
