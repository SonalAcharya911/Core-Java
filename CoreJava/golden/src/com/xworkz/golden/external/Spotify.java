package com.xworkz.golden.external;

import com.xworkz.golden.internal.MusicPlayer;

public class Spotify implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("running playMusic in Spotify");
    }
}
