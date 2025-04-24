package com.xworkz.golden.external;

import com.xworkz.golden.internal.Game;

public class ChessGame implements Game {
    @Override
    public void play() {
        System.out.println("running play in Chess game");
    }
}
