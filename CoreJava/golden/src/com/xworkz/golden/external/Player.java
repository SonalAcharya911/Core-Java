package com.xworkz.golden.external;

import com.xworkz.golden.internal.Game;

public class Player {
    private Game game;

    public Player(Game game){
        this.game=game;
    }

    public void startGame(){
        System.out.println("running startGame in Player");
        if(this.game!=null){
            this.game.play();
        }
        else{
            System.out.println("game is null");
        }
    }

}
