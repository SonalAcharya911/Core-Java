package com.xworkz.external.impl;

import com.xworkz.internal.rule.Radio;

public class RedFMImpl implements Radio {
    @Override
    public void turnOn() {
        System.out.println("running turnOn in RedFMImpl");
    }

    @Override
    public void tuneFrequency() {
        System.out.println("running tuneFrequency in RedFMImpl");
    }

    @Override
    public void increaseVolume() {
        System.out.println("running increaseVolume in RedFMImpl");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("running decreaseVolume in RedFMImpl");
    }

    @Override
    public void turnOff() {
        System.out.println("running turnOff in RedFMImpl");
    }
}
