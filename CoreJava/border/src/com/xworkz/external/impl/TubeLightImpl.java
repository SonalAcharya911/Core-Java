package com.xworkz.external.impl;

import com.xworkz.internal.rule.Light;

public class TubeLightImpl implements Light {
    @Override
    public void turnOff() {
        System.out.println("running turnOff in tubeLightImpl");
    }

    @Override
    public void turnOn() {
        System.out.println("running turnOn in tubeLightImpl");

    }

    @Override
    public void bend() {
        System.out.println("running bend in tubeLightImpl");

    }
}
