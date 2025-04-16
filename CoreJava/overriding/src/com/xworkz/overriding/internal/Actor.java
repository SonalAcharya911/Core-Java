package com.xworkz.overriding.internal;

public class Actor {
    private String movie;
    private int no_of_films;

    public Actor(String movie,int no_of_films){
        this.movie=movie;
        this.no_of_films=no_of_films;

    }
    public Actor(){
        System.out.println("no-arg constructor for Actor");
    }

    public void act(){
        System.out.println("running act in Actor");
    }

    @Override
    public String toString() {
        System.out.println("movie: "+this.movie+" no_of_films: "+this.no_of_films);
        return "";
    }
}
