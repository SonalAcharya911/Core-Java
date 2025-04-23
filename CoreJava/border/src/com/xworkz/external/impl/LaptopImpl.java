package com.xworkz.external.impl;

import com.xworkz.internal.rule.Computer;

public class LaptopImpl implements Computer {
    @Override
    public void start() {
        System.out.println("running start in LaptopImpl");
    }

    @Override
    public void shutDown() {
        System.out.println("running shutDown in LaptopImpl");
    }

    @Override
    public void restart() {
        System.out.println("running restart in LaptopImpl");
    }
}
