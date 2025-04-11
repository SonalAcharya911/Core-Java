package com.xworkz.overriding.internal;

public class Othello extends Story{
    public Othello(){
        System.out.println("no-arg constructor for Othello");
    }
    public void playOthello() {
        System.out.println("running playOthello in Othello");
    }
    public void tellStory() {
        System.out.println("running tellStory in othello");
    }
}
