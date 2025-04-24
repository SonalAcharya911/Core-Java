package com.xworkz.golden.external;

import com.xworkz.golden.internal.MusicPlayer;

public class JioMusic implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("running playMusic in jioMusic");
    }
}
