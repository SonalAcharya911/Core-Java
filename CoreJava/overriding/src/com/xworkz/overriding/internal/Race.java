package com.xworkz.overriding.internal;

public class Race {
    private String type;
    private int laps;

    public void setType(String type){
        this.type = type;
    }

    public void setLaps(int laps){
        this.laps = laps;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("laps: " + laps);
        return "";
    }

    public Race(){
        System.out.println("no-arg constructor for Race");
    }
    public void compete(){
        System.out.println("running compete in Race");
    }
}
