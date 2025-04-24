package com.xworkz.golden.runner;

import com.xworkz.golden.external.JioMusic;
import com.xworkz.golden.external.MusicListener;
import com.xworkz.golden.external.Spotify;
import com.xworkz.golden.internal.MusicPlayer;

public class MusicPlayerRunner {
    public static void main(String[] args) {
        MusicPlayer musicPlayer=new JioMusic();
        MusicPlayer musicPlayer1=new Spotify();

        MusicListener musicListener=new MusicListener(musicPlayer);
        musicListener.listenMusic();
    }
}
