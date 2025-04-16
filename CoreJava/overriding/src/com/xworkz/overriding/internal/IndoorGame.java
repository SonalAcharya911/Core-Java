package com.xworkz.overriding.internal;

public class IndoorGame {
    private String name;
    private int players;

    public IndoorGame(String name, int players){
        this.name = name;
        this.players = players;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("players: " + players);
        return "";
    }

    public IndoorGame(){
        System.out.println("no-arg constructor for IndoorGame");
    }
    public void playIndoor() {
        System.out.println("running playIndoor in IndoorGame");
    }
}
