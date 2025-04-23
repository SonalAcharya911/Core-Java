package com.xworkz.external.impl;

import com.xworkz.internal.rule.Mobile;

public class RealmeImpl implements Mobile {
    @Override
    public void turnOn() {
        System.out.println("running turnOn in RealmeImpl");
    }

    @Override
    public void turnOff() {
        System.out.println("running turnOff in RealmeImpl");

    }

    @Override
    public void call() {
        System.out.println("running call in RealmeImpl");

    }

    @Override
    public void message() {
        System.out.println("running message in RealmeImpl");

    }

    @Override
    public void browse() {
        System.out.println("running browse in RealmeImpl");

    }
}
