package com.xworkz.overriding.internal;

public class Story {
    private String title;
    private String genre;

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString() {
        System.out.println("title: " + title);
        System.out.println("genre: " + genre);
        return "";
    }

    public Story(){
        System.out.println("no-arg constructor for Story");
    }
    public void tellStory() {
        System.out.println("running tellStory in Story");
    }
}
