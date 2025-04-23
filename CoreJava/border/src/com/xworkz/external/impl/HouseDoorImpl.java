package com.xworkz.external.impl;

import com.xworkz.internal.rule.Door;

public class HouseDoorImpl implements Door {
    @Override
    public void open() {
        System.out.println("running open in HouseDoorImpl");
    }

    @Override
    public void close() {
        System.out.println("running close in HouseDoorImpl");
    }

    @Override
    public void knock() {
        System.out.println("running knock in HouseDoorImpl");
    }
}
