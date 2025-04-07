package com.xworkz.card.external;

import com.xworkz.card.internal.Card;

public class Games {
    public Games(){
        System.out.println("no-arg constructor for Games");
    }

    public void play(){
        System.out.println("running play in Games");
        Card card=new Card();
        card.shuffle();
    }
}
