package com.xworkz.golden.runner;

import com.xworkz.golden.external.ChessGame;
import com.xworkz.golden.external.FootbalGame;
import com.xworkz.golden.external.Player;
import com.xworkz.golden.internal.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game game=new FootbalGame();
        Game game1=new ChessGame();

        Player player=new Player(game);
        player.startGame();
    }

}
