package com.xworkz.golden.external;

import com.xworkz.golden.internal.MusicPlayer;

public class MusicListener {
    private MusicPlayer musicPlayer;

    public MusicListener(MusicPlayer musicPlayer){
        this.musicPlayer=musicPlayer;
    }

    public void listenMusic(){
        System.out.println("running listenMusic in MusicListener");
        if(this.musicPlayer!=musicPlayer){
            this.musicPlayer.playMusic();
        }
        else{
            System.out.println("musicPlayer is null");
        }
    }
}
