package com.xworkz.external.impl;

import com.xworkz.internal.rule.HeadPhone;

public class AirpodsImpl implements HeadPhone {
    @Override
    public void powerOn() {
        System.out.println("running powerOn in airpodsImpl");
    }

    @Override
    public void powerOff() {
        System.out.println("running powerOff in airpodsImpl");
    }

    @Override
    public void increaseVolume() {
        System.out.println("running increaseVolume in airpodsImpl");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("running decreaseVolume in airpodsImpl");
    }

    @Override
    public void play() {
        System.out.println("running play in airpodsImpl");
    }

    @Override
    public void pause() {
        System.out.println("running pause in airpodsImpl");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("running connectBluetooth in airpodsImpl");
    }
}
