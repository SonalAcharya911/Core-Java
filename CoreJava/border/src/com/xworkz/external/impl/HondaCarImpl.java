package com.xworkz.external.impl;

import com.xworkz.internal.rule.Car;

public class HondaCarImpl implements Car {
    @Override
    public void start() {
        System.out.println("running start in HondaCarImpl");
    }

    @Override
    public void accelerate() {
        System.out.println("running accelerate in HondaCarImpl");
    }

    @Override
    public void stop() {
        System.out.println("running stop in HondaCarImpl");
    }
}
