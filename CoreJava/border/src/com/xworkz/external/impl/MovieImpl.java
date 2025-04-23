package com.xworkz.external.impl;

import com.xworkz.internal.rule.Video;

public class MovieImpl implements Video {
    @Override
    public void play() {
        System.out.println("running play in MovieImpl");
    }

    @Override
    public void pause() {
        System.out.println("running pause in MovieImpl");
    }

    @Override
    public void stop() {
        System.out.println("running stop in MovieImpl");
    }

    @Override
    public void record() {
        System.out.println("running record in MovieImpl");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("running increaseSpeed in MovieImpl");
    }
}
