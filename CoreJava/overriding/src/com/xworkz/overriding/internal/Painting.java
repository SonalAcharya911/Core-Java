package com.xworkz.overriding.internal;

public class Painting {
    private String artist;
    private String medium;

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setMedium(String medium){
        this.medium = medium;
    }

    @Override
    public String toString() {
        System.out.println("artist: " + artist);
        System.out.println("medium: " + medium);
        return "";
    }

    public Painting(){
        System.out.println("no-arg constructor for Painting");
    }
    public void makePainting() {
        System.out.println("running makePainting in Painting");
    }
}
