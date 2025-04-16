package com.xworkz.overriding.internal;

public class Oil {
    private String source;
    private double volume;

    public void setSource(String source) {
        this.source = source;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        System.out.println("source: " + source);
        System.out.println("volume: " + volume);
        return "";
    }

    public Oil(){
        System.out.println("no-arg constructor for Oil");
    }
    public void applyOil() {
        System.out.println("running applyOil in Oil");
    }

}
