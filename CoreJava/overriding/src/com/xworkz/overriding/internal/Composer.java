package com.xworkz.overriding.internal;

public class Composer {
    private String style;

    private int compositions;

    public Composer(String style,int compositions){
        this.compositions=compositions;
        this.style=style;
    }

    @Override
    public String toString() {
        System.out.println("style"+style);
        System.out.println("compositions"+compositions);
        return "";
    }

    public Composer(){
        System.out.println("no-arg constructor for Composer");
    }

    public void orchestrate() {
        System.out.println("running orchestrate in Composer");
    }
}
