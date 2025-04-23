package com.xworkz.external.impl;

import com.xworkz.internal.rule.Bell;

public class DoorBellImpl implements Bell {

    @Override
    public void ring() {
        System.out.println("running ring in DoorBellImpl");
    }
}
